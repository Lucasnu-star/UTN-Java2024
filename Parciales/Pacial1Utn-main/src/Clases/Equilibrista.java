package Clases;

import Interfaces.IShow;

/**
 * Clase equilibrisra, esta clase es subclase de Persona y tiene un solo atributo que son los años que tiene de antiguedad 'int' (No puede ser un numero negativo).
 */

public class Equilibrista extends Persona implements IShow {

    //Atributos
    protected int antiguedad;

    //Constructor
    public Equilibrista(String nombre, String dni, int antiguedad) {
        super(nombre, dni);
        this.antiguedad = antiguedad;
    }

    //Getter && Setters
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //ToString
    @Override
    public String toString() {
        return "/ Soy un equilibrista " + super.toString() +
                "antiguedad=" + antiguedad + "/";
    }

    //Metodos
    @Override
    public String ensayar() {
        return "Mi nombre es: " + nombre + " y soy un equilibrista que esta ensayando.";
    }
    @Override
    public String probarseVestuario() {
        return "Me estoy el vestuario para el show.";
    }
    @Override
    public String brindarShow() {
        return "Soy " + nombre + " y soy un equilibrista que esta dando un excelente show!";
    }
    @Override
    public String promocionCirco() {
        return super.promocionCirco() + " vengan a ver mi show de equilibrismo!";
    }
}
