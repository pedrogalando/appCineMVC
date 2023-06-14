/** *****************************************************************************
 * Autor: Rolando Pedro Gabriel                                                *
 * Fecha de creación: 31/05/2023                                               *
 * Fecha de modificación:                                                      *
 * Descripción: Clase para modelar atributos y métodos propios del actor.      *
 ***************************************************************************** */
package entity;

// Esta clase hereda los atributos y comportamientos de la clase Persona.
import java.util.Date;

public class Actor extends Persona {
    public Actor() {
    }

    public Actor(int id, String nombre, Date fechaNacimiento) {
        super(id, nombre, fechaNacimiento);
    }
}
