/*
 * SubClase Trabajador de Persona
 */
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Javier
 */
public class Trabajador extends Persona implements Serializable{
    private static final long serialVersionUID = 1;
    
    /*Atributos de clase Persona*/
    protected double sueldo;
    protected String especialidad;
    
    /*Constructor Principal*/
    public Trabajador(String nombre, String apellidos, String dni, LocalDate fechaNacimiento, Sexo sexo, double sueldo, String especialidad ) {
        super(nombre, apellidos, dni, fechaNacimiento, sexo);
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }
    //  Constructor instancia
    public Trabajador() {
        
    }

    /*Métodos getter and setter*/
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //  Método toString
    @Override
    public String toString() {
        return "Trabajador " + nombre + " " + apellidos + " " + dni + 
                " { " + "sueldo= " + sueldo + " €/mes" + 
                ", especialidad= " + especialidad 
                + '}';
    }
}
