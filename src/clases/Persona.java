/*
 * Clase de Persona
 */
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Javier
 */
public class Persona implements Serializable{
    private static final long serialVersionUID = 1;
    
    /*Clase enumerada anidada*/
    public enum Sexo {
        HOMBRE,
        MUJER,
        OTRO;
    }
    
    /*Atributos*/
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected LocalDate fechaNacimiento;
    protected Sexo sexo;
    
    /*Constructor Principal*/
    public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo=sexo;
    }
    
    //  Constructor vacío para la creación de una instancia
    public Persona() {
        
    }

    
    /*Métodos getter and setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    
    /*Método toString*/
    @Override
    public String toString() {
        return "Nombre: " + nombre + 
                ", Apellidos: " + apellidos + 
                ", DNI: " + dni + 
                ", fecha de nacimiento: " + fechaNacimiento + 
                ", sexo:" + sexo;
    }
}
