package model;

import entity.Genero;
import java.util.List;
import javax.swing.DefaultListModel;

public class GeneroModelImpl implements IGeneroModel {

    @Override
    public void crearRegistro(List<Genero> lista, Genero genero) {
        genero.setId(lista.size() + 1);
        lista.add(genero);
    }

    @Override
    public void eliminarRegistro(List<Genero> lista, int id) {
        for (Genero genero : lista) {
            if (genero.getId() == id) {
                lista.remove(genero);
                break;
            }
        }
    }

    @Override
    public void mostrarRegistro(List<Genero> lista, DefaultListModel modelo) {
        modelo.removeAllElements();

        for (Genero genero : lista) {
            modelo.addElement(genero.getId() + "-" + genero.getNombre());
        }
    }

    @Override
    public void actualizarRegistro(List<Genero> lista, Genero genero) {
        for (Genero objGenero : lista) {
            if (objGenero.getId() == genero.getId()) {
                lista.set(genero.getId() - 1, genero);
                break;
            }
        }
    }

}
