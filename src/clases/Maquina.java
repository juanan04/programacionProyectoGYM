/*
 * Clase de Maquina
 */
package clases;

import java.io.Serializable;


/**
 *
 * @author Javier
 */
public class Maquina implements Serializable{
    private static final long serialVersionUID = 1;
    
    //  Atributos
    private String nombre;
    private String ubicacion;
    
    //  Constructor principal
    public Maquina(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    // Constructor para la instancia
    public Maquina() {
        
    }

    //  Métodos getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    //  Método toString
    @Override
    public String toString() {
        return "Nombre de la máquina : " + nombre + 
                ", ubicación : " + ubicacion;
    }
}
