/*
 * Clase de Eventos
 */
package clases;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Javier
 */
public class Evento implements Serializable{
    private static final long serialVersionUID = 1;

    //  Atributos
    private String nombre;
    private int duracion;
    private LocalDateTime fechaYhora;
    private int cantidadParticipantes;

    //  Constructor principal
    public Evento(String nombre, int duracion, LocalDateTime fechaYhora, int cantidadParticipantes) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaYhora = fechaYhora;
        this.cantidadParticipantes = cantidadParticipantes;
    }
    
    //  Constructor para la instancia
    public Evento() {
        
    }

    //  Métodos getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    //  Método toString
    @Override
    public String toString() {
        return "Nombre del evento : " + nombre + 
                ", duración : " + duracion + " minutos" +
                ", fecha y hora : " + fechaYhora + 
                ", cantidad de participantes máxima" + cantidadParticipantes;
    }

}
