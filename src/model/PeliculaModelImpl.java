package model;

import entity.Actor;
import entity.Pelicula;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PeliculaModelImpl implements IPeliculaModel {

    @Override
    public void crearRegistro(List<Pelicula> lista, Pelicula pelicula) {
        pelicula.setId(lista.size() + 1);
        lista.add(pelicula);
    }

    @Override
    public void eliminarRegistro(List<Pelicula> lista, int id) {
        for (Pelicula pelicula : lista) {
            if (pelicula.getId() == id) {
                lista.remove(pelicula);
                break;
            }
        }
    }

    @Override
    public void mostrarRegistro(List<Pelicula> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[7];
            fila[0] = lista.get(i).getId();
            fila[1] = lista.get(i).getNombre();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            fila[2] = dateFormat.format(lista.get(i).getLanzamiento());
            fila[3] = lista.get(i).getDuracion();
            fila[4] = lista.get(i).getSinopsis();
            fila[5] = lista.get(i).getGenero().getNombre();

            String actores = "";
            for (Actor actor : lista.get(i).getListaAutor()) {
                actores += actor.getNombre() + ",";
            }

            fila[6] = actores;

            modelo.addRow(fila);
        }
    }

    @Override
    public void actualizarRegistro(List<Pelicula> lista, Pelicula pelicula) {
        for (Pelicula objActor : lista) {
            if (objActor.getId() == pelicula.getId()) {
                lista.set(objActor.getId() - 1, pelicula);
                break;
            }
        }
    }
}
