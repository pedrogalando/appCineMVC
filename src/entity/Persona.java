/*******************************************************************************
 * Autor: Rolando Pedro Gabriel                                                *
 * Fecha de creación: 31/05/2023                                               * 
 * Fecha de modificación:                                                      *
 * Descripción: Clase base para reunir todos los atributos comúnes entre el    *
 *              actor, director, productor, etc.                               * 
 ******************************************************************************/
package entity;

// Importación de las bibliotecas
import java.util.Date;

// Clase persona
public class Persona {
    // Declaración de los atributos de la clase
    private int id;
    private String nombre;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {
    }

    // Sobrecarga del cosntructor
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }       

    // Sobrecarga del constructor
    public Persona(int id, String nombre, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos get y set
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }    
}
