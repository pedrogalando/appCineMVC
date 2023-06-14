
package service;

import entity.Actor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IActorService {
    public void crearRegistro(List<Actor> lista, Actor actor);
    public void eliminarRegistro(List<Actor> lista, int id);
    public void mostrarRegistro(List<Actor> lista, DefaultTableModel modelo);
    public void actualizarRegistro(List<Actor> lista, Actor actor);
}
