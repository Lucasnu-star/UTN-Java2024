package Clases;
import Clases.Interfaces.iAnimal;

import java.util.Objects;

public abstract class Animal implements iAnimal {

    //Atributos
    private int idRegistro;
    private String especie;
    private int edad;

    //Constructor
    public Animal(int idRegistro, String especie, int edad) {
        this.idRegistro = idRegistro;
        this.especie = especie;
        this.edad = edad;
    }

    //Getters
    public int getIdRegistro() {
        return idRegistro;
    }
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }

    //Setters
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Equals && HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return idRegistro == animal.idRegistro && edad == animal.edad && Objects.equals(especie, animal.especie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idRegistro, especie, edad);
    }

    //ToString

    @Override
    public String toString() {
        return "Animal" +
                "idRegistro=" + idRegistro +
                ", especie='" + especie + '\'' +
                ", edad=" + edad;
    }


    //Metodos

    @Override
    public String aparearse() {
        return " se aparea";
    }

    @Override
    public String comer() {
        return " come";
    }

    @Override
    public String dormir() {
        return " duerme";
    }
}
