
package service;

import entity.Actor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ActorModelImpl;
import model.IActorModel;


public class ActorServiceImpl implements IActorService{
    private final IActorModel model = new ActorModelImpl();

    @Override
    public void crearRegistro(List<Actor> lista, Actor actor) {
        model.crearRegistro(lista, actor);
    }

    @Override
    public void eliminarRegistro(List<Actor> lista, int id) {
        model.eliminarRegistro(lista, id);
    }

    @Override
    public void mostrarRegistro(List<Actor> lista, DefaultTableModel modelo) {
        model.mostrarRegistro(lista, modelo);
    }

    @Override
    public void actualizarRegistro(List<Actor> lista, Actor actor) {
        model.actualizarRegistro(lista, actor);
    }    
}
