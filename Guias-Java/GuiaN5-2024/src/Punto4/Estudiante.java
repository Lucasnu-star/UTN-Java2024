package Punto4;

import Punto4.Exepciones.ExcepcionNoTieneNacionalidad;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private String nacionalidad;

    public Estudiante(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    //Getters && Setters
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Equals && HashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(nacionalidad, that.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nacionalidad);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
