package PuntoBonusTrack;

import java.util.ArrayList;

public class Hangares <T> {

    private ArrayList<T> avionesEnHangar;

    //Atributos
    private String nombreTipoHangar;
    private Aeropuerto nombreAeropuerto_Hangar;

    //Constructor
    public Hangares(String nombreTipoHangar, Aeropuerto nombreAeropuerto_Hangar) {
        this.nombreTipoHangar = nombreTipoHangar;
        this.nombreAeropuerto_Hangar = nombreAeropuerto_Hangar;
        avionesEnHangar= new ArrayList<>();
    }


    //Getters
    public String getNombreTipoHangar() {
        return nombreTipoHangar;
    }
    public Aeropuerto getNombreAeropuerto_Hangar() {
        return nombreAeropuerto_Hangar;
    }

    //Setters
    public void setNombreTipoHangar(String nombreTipoHangar) {
        this.nombreTipoHangar = nombreTipoHangar;
    }
    public void setNombreAeropuerto_Hangar(Aeropuerto nombreAeropuerto_Hangar) {
        this.nombreAeropuerto_Hangar = nombreAeropuerto_Hangar;
    }

    //Metodos
    public void avionIngresaHangar(T avion)
    {
        avionesEnHangar.add(avion);
    }

    public void avionSaleHangar(T avion)
    {
        avionesEnHangar.remove(avion);
    }
    public int cuantosAvionesEnHangar()
    {
        return avionesEnHangar.size();
    }





    //ToString


    @Override
    public String toString() {
        return "Hangares{" +
                "avionesEnHangar=" + avionesEnHangar.toString() +
                ", nombreTipoHangar='" + nombreTipoHangar + '\'' +
                ", nombreAeropuerto_Hangar=" + nombreAeropuerto_Hangar +
                '}';
    }
}
