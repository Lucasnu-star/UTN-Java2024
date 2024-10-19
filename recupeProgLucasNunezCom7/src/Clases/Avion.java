package Clases;

import Interfaces.IVehiculoAereo;

/**
 * Esta clase avion extiend de vehiculo e implementa la interfaz IVehiculoAereo con sus respectivos metodos
 * Esta clase tiene su atributo propio que son las horas de vuelo( INT ) , no ingresar numero negativo.
 */
public class Avion extends Vehiculo implements IVehiculoAereo {

    //Atributos
    private int horasVuelo;

    //Constructores
    public Avion(String marca, String modelo, String anio, int horasVuelo) {
        super(marca, modelo, anio);
        this.horasVuelo = horasVuelo;
    }
    public Avion() {

    }

    //Getter & Setter
    public int getHorasVuelo() {
        return horasVuelo;
    }
    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "horasVuelo=" + horasVuelo;
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
