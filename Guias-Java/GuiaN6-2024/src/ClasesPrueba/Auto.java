package ClasesPrueba;


import java.util.Objects;

public class Auto {

    private String modelo;
    private int anio;

    public Auto(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return anio == auto.anio && Objects.equals(modelo, auto.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, anio);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
