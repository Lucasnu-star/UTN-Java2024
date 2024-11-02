package Clases;

import java.util.Objects;

public class Cuidador {

    //Atributos
    private int idRegistro;
    private String nombreCuidador;
    private String sectorTrabajo;

    //Constructores
    public Cuidador(int idRegistro, String nombreCuidador, String sectorTrabajo) {
        this.idRegistro = idRegistro;
        this.nombreCuidador = nombreCuidador;
        this.sectorTrabajo = sectorTrabajo;
    }
    public Cuidador() {
    }

    //Getters
    public int getIdRegistro() {
        return idRegistro;
    }
    public String getNombreCuidador() {
        return nombreCuidador;
    }
    public String getSectorTrabajo() {
        return sectorTrabajo;
    }

    //Setters
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    public void setNombreCuidador(String nombreCuidador) {
        this.nombreCuidador = nombreCuidador;
    }
    public void setSectorTrabajo(String sectorTrabajo) {
        this.sectorTrabajo = sectorTrabajo;
    }

    //Equals && HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuidador cuidador = (Cuidador) o;
        return idRegistro == cuidador.idRegistro && Objects.equals(nombreCuidador, cuidador.nombreCuidador) && Objects.equals(sectorTrabajo, cuidador.sectorTrabajo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idRegistro, nombreCuidador, sectorTrabajo);
    }

    //ToString
    @Override
    public String toString() {
        return "Cuidador" +
                "idRegistro=" + idRegistro +
                ", nombreCuidador='" + nombreCuidador + '\'' +
                ", sectorTrabajo='" + sectorTrabajo + '\'';
    }
}
