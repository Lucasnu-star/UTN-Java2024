package Clases;

import Interfaces.IVehiculo;

import java.util.Objects;

/**
 * Esta clase Vehiculo es abstracta e implementa la clase comparable para comparar y ordenar por marca los vehiculos de la flota e implementa la interfaz Ivehiculo que al implementarla aca
 * las clases hijas tambien las implementan.
 */

public abstract class Vehiculo  implements Comparable<Vehiculo> , IVehiculo   {

    //Atributos
    private String marca;
    private String modelo;
    private String anio;

    //Constructores
    public Vehiculo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public Vehiculo() {
    }

    //Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAnio() {
        return anio;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }

    //ToString
    @Override
    public String toString() {
        return
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo) && Objects.equals(anio, vehiculo.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio);
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.marca.compareTo(o.getMarca());
    }

    //Metodos
    @Override
    public String darAltaAlquiler() {
        return "Dar alta alquiler:  " + toString();
    }
    @Override
    public String darBajaAlquiler() {
        return "Dar baja alquiler:  " + toString();
    }
}
