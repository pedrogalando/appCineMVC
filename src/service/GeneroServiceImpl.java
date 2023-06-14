
package service;

import entity.Genero;
import java.util.List;
import javax.swing.DefaultListModel;
import model.GeneroModelImpl;
import model.IGeneroModel;

public class GeneroServiceImpl implements IGeneroService {

    private final IGeneroModel model = new GeneroModelImpl();

    @Override
    public void crearRegistro(List<Genero> lista, Genero genero) {
        model.crearRegistro(lista, genero);
    }

    @Override
    public void eliminarRegistro(List<Genero> lista, int id) {
        model.eliminarRegistro(lista, id);
    }

    @Override
    public void mostrarRegistro(List<Genero> lista, DefaultListModel modelo) {
        model.mostrarRegistro(lista, modelo);
    }

    @Override
    public void actualizarRegistro(List<Genero> lista, Genero genero) {
        model.actualizarRegistro(lista, genero);
    }

}
