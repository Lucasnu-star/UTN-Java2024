package PuntoBonusTrack.TipoAviones.Militar;

import PuntoBonusTrack.Avion;
import PuntoBonusTrack.TipoAviones.Interfaces.iMilitar_Carga;

import java.util.Objects;

public class Militar extends Avion implements iMilitar_Carga{

    //Atributos
    eSistemaArma sistemaArma;
    private long cantBalas;

    //Constructor
    public Militar(String nombreModelo, String marcar, int capacidadCombustible, String tipoMotor, int cantidadAsientos, eSistemaArma sistemaArma, long cantBalas) {
        super(nombreModelo, marcar, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.sistemaArma = sistemaArma;
        this.cantBalas = cantBalas;
    }

    //Getters
    public eSistemaArma getSistemaArma() {
        return sistemaArma;
    }
    public long getCantBalas() {
        return cantBalas;
    }

    //Setters
    public void setSistemaArma(eSistemaArma sistemaArma) {
        this.sistemaArma = sistemaArma;
    }
    public void setCantBalas(long cantBalas) {
        this.cantBalas = cantBalas;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "sistemaArma=" + sistemaArma +
                ", cantBalas=" + cantBalas ;
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
    public Boolean ingresar(String ingresar)
    {
        return Objects.equals(ingresar, "si");
    }
}
