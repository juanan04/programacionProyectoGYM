/*
 * Clase de Producto
 */
package clases;

import java.io.Serializable;



/**
 *
 * @author Javier
 */
public class Producto implements Serializable{
    private static final long serialVersionUID = 1;

    /*Atributos de la clase Producto*/
    private String nombre;
    private double precio;
    private int codigo;

    /*Constructor de la clase Producto*/
    public Producto(String nombre, double precio, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    //  Constructor para instancia
    public Producto() {

    }

    /*Métodos getter and setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //  Método toString de la clase Producto
    @Override
    public String toString() {
        return "Nombre del producto : " + nombre + 
                ", precio: " + precio + 
                ", codigo: " + codigo;
    }
}
