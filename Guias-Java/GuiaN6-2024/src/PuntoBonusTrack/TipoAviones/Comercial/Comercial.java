package PuntoBonusTrack.TipoAviones.Comercial;
import PuntoBonusTrack.Avion;
import PuntoBonusTrack.TipoAviones.Interfaces.iComercial_Privado;


public class Comercial  extends Avion  implements iComercial_Privado {

    //Atributos
    private int cantidadAzafatas;
    private Servicios servicios;

    //Constructor
    public Comercial(String nombreModelo, String marcar, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas, Servicios servicios) {
        super(nombreModelo, marcar, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = servicios;
    }

    //Getters
    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }
    public Servicios getServicios() {
        return servicios;
    }

    //Setters
    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }
    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    //ToString
    @Override
    public String toString() {
        return  super.toString() +
                "cantidadAzafatas=" + cantidadAzafatas +
                ", servicios=" + servicios.toString();
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
    public String servirComida() {
        return getNombreModelo() + " sirve la comida";
    }

    @Override
    public String darManta() {
        return  getNombreModelo() + " da la manta";
    }
}
