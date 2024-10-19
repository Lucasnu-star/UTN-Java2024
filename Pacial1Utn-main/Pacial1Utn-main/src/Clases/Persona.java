package Clases;

import Interfaces.IPromocion;

/**
 * Clase persona, esta clase va a ser abstracta y va a tener 4 subclases(Payaso, Equilibrista, Adiestrador y PersonalMantenimiento)
 */

public  abstract class Persona implements IPromocion {

    //Atributos
    protected String nombre;
    protected String dni;

    //Constructor
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Gettes
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //ToString
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'';
    }

    //Metodos

    @Override
    public String promocionCirco() {
        return "Entrega folleto";
    }
}
