package controller;

import entity.Pelicula;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IPeliculaService;
import service.PeliculaServiceImpl;

public class PeliculaController {
    private final IPeliculaService service = new PeliculaServiceImpl();
    
    public void crearRegistro(List<Pelicula> lista, Pelicula pelicula){
        service.crearRegistro(lista, pelicula);
    }
    
    public void eliminarRegistro(List<Pelicula> lista, int id){
        service.eliminarRegistro(lista, id);
    }
    
    public void mostrarRegistro(List<Pelicula> lista, DefaultTableModel modelo){
        service.mostrarRegistro(lista, modelo);
    }
    
    public void actualizarRegistro(List<Pelicula> lista, Pelicula pelicula){
        service.actualizarRegistro(lista, pelicula);
    }
}
