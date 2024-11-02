package Clases;

import java.util.Objects;

public final class Mamifero extends Animal{

    //Atributo
    private String tipoHabitar; // Selva, Sabana, Bosque, etc.

    //Constructor
    public Mamifero(int idRegistro, String especie, int edad, String tipoHabitar) {
        super(idRegistro, especie, edad);
        this.tipoHabitar = tipoHabitar;
    }

    //Getter && Setter
    public String getTipoHabitar() {
        return tipoHabitar;
    }
    public void setTipoHabitar(String tipoHabitar) {
        this.tipoHabitar = tipoHabitar;
    }

    //Equals && Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mamifero mamifero = (Mamifero) o;
        return Objects.equals(tipoHabitar, mamifero.tipoHabitar);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoHabitar);
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + " Mamifero: " +
                "tipoHabitar='" + tipoHabitar + '\'';
    }

    //Metodos
    @Override
    public String dormir() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.dormir();
    }
    @Override
    public String aparearse() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.aparearse();
    }
    @Override
    public String comer() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.comer();
    }
}
