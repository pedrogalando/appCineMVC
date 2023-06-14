/*******************************************************************************
 * Autor: Rolando Pedro Gabriel                                                *
 * Fecha de creación: 31/05/2023                                               * 
 * Fecha de modificación:                                                      *
 * Descripción: Clase intermedia para comunicar de la vista y al servicio.     * 
 ******************************************************************************/
package controller;

import entity.Actor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.ActorServiceImpl;
import service.IActorService;

public class ActorController {
    private final IActorService service = new ActorServiceImpl();
    
    public void crearRegistro(List<Actor> lista, Actor actor){
        service.crearRegistro(lista, actor);
    }
    
    public void eliminarRegistro(List<Actor> lista, int id){
        service.eliminarRegistro(lista, id);
    }
    
    public void mostrarRegistro(List<Actor> lista, DefaultTableModel modelo){
        service.mostrarRegistro(lista, modelo);
    }
    
    public void actualizarRegistro(List<Actor> lista, Actor actor){
        service.actualizarRegistro(lista, actor);
    }
}
