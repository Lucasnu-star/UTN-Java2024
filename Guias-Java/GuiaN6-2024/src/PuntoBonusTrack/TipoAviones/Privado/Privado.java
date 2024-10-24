package PuntoBonusTrack.TipoAviones.Privado;

import PuntoBonusTrack.Avion;
import PuntoBonusTrack.TipoAviones.Interfaces.iComercial_Privado;
import PuntoBonusTrack.TipoAviones.Interfaces.iPrivado;

import java.util.Objects;

public class Privado extends Avion implements iComercial_Privado, iPrivado {

    //Atributos
    private eJacuzzi jacuzzi;
    private String claveWifi;

    //Constructor
    public Privado(String nombreModelo, String marcar, int capacidadCombustible, String tipoMotor, int cantidadAsientos, eJacuzzi jacuzzi, String claveWifi) {
        super(nombreModelo, marcar, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    //Getters
    public eJacuzzi getJacuzzi() {
        return jacuzzi;
    }
    public String getClaveWifi() {
        return claveWifi;
    }

    //Setters
    public void setJacuzzi(eJacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }
    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    //ToString

    @Override
    public String toString() {
        return super.toString() +
                "jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'';
    }

    //Metodos

    @Override
    public String vuela() {
        return getNombreModelo() + super.vuela();
    }

    @Override
    public String aterriza() {
        return getNombreModelo() + super.aterriza();
    }

    @Override
    public String despega() {
        return getNombreModelo() + super.despega();
    }


    @Override
    public String darManta() {
        return getNombreModelo() +  " da la manta";
    }

    @Override
    public String servirComida() {
        return getNombreModelo() + " sirve la comida";
    }

    @Override
    public Boolean verPartido(String ver)
    {
        return Objects.equals(ver, "si");
    }
}
