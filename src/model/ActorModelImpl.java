package model;

import entity.Actor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ActorModelImpl implements IActorModel {

    @Override
    public void crearRegistro(List<Actor> lista, Actor actor) {
        actor.setId(lista.size() + 1);
        lista.add(actor);
    }

    @Override
    public void eliminarRegistro(List<Actor> lista, int id) {
        for (Actor actor : lista) {
            if (actor.getId() == id) {
                lista.remove(actor);
                break;
            }
        }
    }

    @Override
    public void mostrarRegistro(List<Actor> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[3];
            fila[0] = lista.get(i).getId();
            fila[1] = lista.get(i).getNombre();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            fila[2] = dateFormat.format(lista.get(i).getFechaNacimiento());
            modelo.addRow(fila);
        }
    }

    @Override
    public void actualizarRegistro(List<Actor> lista, Actor actor) {
        for (Actor objActor : lista) {
            if (objActor.getId() == actor.getId()) {
                lista.set(objActor.getId() - 1, actor);
                break;
            }
        }
    }

}
