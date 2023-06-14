
package service;

import entity.Pelicula;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IPeliculaModel;
import model.PeliculaModelImpl;

public class PeliculaServiceImpl implements IPeliculaService{
    private IPeliculaModel model = new PeliculaModelImpl();

    @Override
    public void crearRegistro(List<Pelicula> lista, Pelicula pelicula) {
        model.crearRegistro(lista, pelicula);
    }

    @Override
    public void eliminarRegistro(List<Pelicula> lista, int id) {
        model.eliminarRegistro(lista, id);
    }

    @Override
    public void mostrarRegistro(List<Pelicula> lista, DefaultTableModel modelo) {
        model.mostrarRegistro(lista, modelo);
    }

    @Override
    public void actualizarRegistro(List<Pelicula> lista, Pelicula pelicula) {
        model.actualizarRegistro(lista, pelicula);
    }    
}
