
package service;

import entity.Pelicula;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IPeliculaService {
    public void crearRegistro(List<Pelicula> lista, Pelicula pelicula);
    public void eliminarRegistro(List<Pelicula> lista, int id);
    public void mostrarRegistro(List<Pelicula> lista, DefaultTableModel modelo);
    public void actualizarRegistro(List<Pelicula> lista, Pelicula pelicula);
}
