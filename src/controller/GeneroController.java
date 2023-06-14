
package controller;

import entity.Genero;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import service.GeneroServiceImpl;
import service.IGeneroService;

public class GeneroController {
    private IGeneroService service = new GeneroServiceImpl();
    
    public void crearRegistro(List<Genero> lista, Genero genero){
        service.crearRegistro(lista, genero);
    }
    
    public void eliminarRegistro(List<Genero> lista, int id){
        service.eliminarRegistro(lista, id);
    }
    
    public void mostrarRegistro(List<Genero> lista, DefaultListModel modelo){
        service.mostrarRegistro(lista, modelo);
    }
    
    public void actualizarRegistro(List<Genero> lista, Genero genero){
        service.actualizarRegistro(lista, genero);
    }
}
