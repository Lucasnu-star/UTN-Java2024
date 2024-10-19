package Clases;

import Interfaces.IVehiculoAereo;

/**
 * Esta clase Helicoptero extiende de vehiculo e implementa la interfaz vehiculoAerep
 * Tiene su propio atributo que es la id de cada avion(Por cada avion ingresado se le suma 1 automaticamente) dandonos cuantos Helicopteros hay en nuestra flota
 *
 */
public class Helicoptero extends Vehiculo implements IVehiculoAereo {


    private static int contadorHelicopteros = 1;
    //Atributos
    private int id;



    //Constructores
    public Helicoptero(String marca, String modelo, String anio) {
        super(marca, modelo, anio);
        this.id = contadorHelicopteros++ ;
    }
    public Helicoptero() {

    }

    //Getter (Setter no se implementa porque no esta bueno que se pueda cambiar el id).
    public int getId() {
        return id;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                ", id=" + id;
    }

    //Metodos
    @Override
    public String aterrizar() {
        return "El" + toString() + " aterrizo correctamente";
    }
    @Override
    public String despegar() {
        return "El" + toString() + " despego correctamente";
    }
}
