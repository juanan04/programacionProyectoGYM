/*
 * Clase Gym.
 */
package clases;

/*
 *  Importaciones
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Javier
 */
public class Gym implements Serializable{
    private static final long serialVersionUID = 1;
    
    //  Atributos
    private String nombre;
    private List<Cliente> clientes;
    private List<Evento> eventos;
    private List<Maquina> maquinas;
    private List<Persona> personas;
    private List<Producto> productos;
    private List<Trabajador> trabajadores;
    
    //  Constructor principal
    public Gym(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList();
        eventos = new ArrayList();
        maquinas = new ArrayList();
        personas = new ArrayList();
        productos = new ArrayList();
        trabajadores = new ArrayList();
    }
    
    // Métodos getter and setter
    public Gym() {
        this("JJ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    //  Método toString
    @Override
    public String toString() {
        return nombre;
    }
    
    //  Método para guardar los datos en un archivo .dat
    public static void guardarDatos(Gym g) {
        try {
            ObjectOutputStream salida = 
                    new ObjectOutputStream(new FileOutputStream("gym.dat"));
            salida.writeObject(g);
            salida.close();
        } catch (IOException ex) {  //  En caso de fallo al guardar lanza error
            System.err.println("Error al guardar datos: " + ex.getMessage());
        }
    }
    
    //  Método para cargar los datos guardados anteriormente
    public static Gym cargarDatos() {
        Gym g;
        try {
            ObjectInputStream entrada = 
                    new ObjectInputStream(new FileInputStream("gym.dat"));
            g = (Gym)entrada.readObject();
            entrada.close();
        } catch (IOException | ClassNotFoundException ex) { //  En caso de no encontrar archivo lanza error
            g = new Gym();
        }
        return g;
    }
    
}
