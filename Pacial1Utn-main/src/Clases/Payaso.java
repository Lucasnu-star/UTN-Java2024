package Clases;

import Interfaces.IShow;

/**
 * Esta clase es subclase de Persona y tiene un solo atributo, cantidad de rutinas que tiene el payaso 'int' (No puede ser negativo)
 */

public class Payaso extends Persona implements IShow {

    //Atributos
    protected int cantidadRutinas;

    //Constructor
    public Payaso(String nombre, String dni, int cantidadRutinas) {
        super(nombre, dni);
        this.cantidadRutinas = cantidadRutinas;
    }

    //Getter && Setter
    public int getCantidadRutinas() {
        return cantidadRutinas;
    }
    public void setCantidadRutinas(int cantidadRutinas) {
        this.cantidadRutinas = cantidadRutinas;
    }

    //ToString
    @Override
    public String toString() {
        return "/ Soy un payaso, " + super.toString() +
                "cantidadRutinas=" + cantidadRutinas + " /";
    }

    //Metodos
    @Override
    public String ensayar() {
        return "Mi nombre es: " + nombre + " y soy un payaso que esta ensayando.";
    }
    @Override
    public String probarseVestuario() {
        return "Me estoy probando el vestuario para el show.";
    }
    @Override
    public String brindarShow() {
        return "Soy " + nombre + " y soy un payaso que esta dando un excelente show!";
    }
    @Override
    public String promocionCirco() {
        return super.promocionCirco() + "venga a ver mi show de humor! ";
    }
}