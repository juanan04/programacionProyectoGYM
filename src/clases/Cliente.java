/*
 * SubClase Cliente de Persona
 */
package clases;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Javier
 */
public class Cliente extends Persona implements Serializable{
    private static final long serialVersionUID = 1;
    
    //  Clase enumerada anidada
    public enum Pago {
        PAYPAL,
        TRANSFERENCIA,
        TARJETA,
        OTRO;
    }
    
    //  Atributos
    protected double peso;
    protected double altura;
    protected int duracionMensualidad;
    protected Pago formaPago;
    
    //  Constructor principal
    public Cliente(String nombre, String apellidos, String dni, LocalDate fechaNacimiento, Sexo sexo, double peso, double altura, int duracionMensualidad, Pago formaPago) {
        super(nombre, apellidos, dni, fechaNacimiento, sexo);
        this.peso = peso;
        this.altura = altura;
        this.duracionMensualidad = duracionMensualidad;
        this.formaPago = formaPago;
    }
    
    //  Constructor para instancia
    public Cliente(){
        
    }

    //  Métodos getter and setter
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDuracionMensualidad() {
        return duracionMensualidad;
    }

    public void setDuracionMensualidad(int duracionMensualidad) {
        this.duracionMensualidad = duracionMensualidad;
    }

    public Pago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Pago formaPago) {
        this.formaPago = formaPago;
    }

    //  Método toString
    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellidos+ " " + dni + " {" 
                + "peso= " + peso + " kg" + ", altura= " + altura + " m" + ", duracionMensualidad= " + duracionMensualidad + " días" + ", formaPago= " + formaPago 
                + '}';
    }
}

