
package entity;

import java.util.Date;
import java.util.List;


public class Pelicula {
    private int id;
    private String nombre;
    private Date lanzamiento;
    private int duracion;
    private String sinopsis;
    private Genero genero;
    private List<Actor> listaAutor;

    public Pelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    } 

    public List<Actor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(List<Actor> listaAutor) {
        this.listaAutor = listaAutor;
    }
}
