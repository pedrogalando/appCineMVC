
package service;

import entity.Genero;
import java.util.List;
import javax.swing.DefaultListModel;

public interface IGeneroService {
       public void crearRegistro(List<Genero> lista, Genero genero);
    public void eliminarRegistro(List<Genero> lista, int id);
    public void mostrarRegistro(List<Genero> lista, DefaultListModel modelo);
    public void actualizarRegistro(List<Genero> lista, Genero genero);
}
