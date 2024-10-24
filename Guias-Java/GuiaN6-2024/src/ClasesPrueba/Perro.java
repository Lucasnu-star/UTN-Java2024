package ClasesPrueba;

import java.util.Objects;

public class Perro {

    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return edad == perro.edad && Objects.equals(nombre, perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return  "El perrito- " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad;
    }
}
