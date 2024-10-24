package PuntoBonusTrack;



public class Avion  implements iAviones{

    //Atributos
    private String nombreModelo;
    private String marca;
    private int capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;

    //Constructor
    public Avion(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }

    //Getters
    public String getNombreModelo() {
        return nombreModelo;
    }
    public String getMarcar() {
        return marca;
    }
    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    //Setters
    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }
    public void setMarcar(String marcar) {
        this.marca = marcar;
    }
    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    //ToString
    @Override
    public String toString() {
        return "Avion{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", marcar='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                '}';
    }

    //Metodos
    @Override
    public String aterriza() {
        return "Aterriza";
    }
    @Override
    public String vuela() {
        return "Vuela";
    }
    @Override
    public String despega() {
        return "Despega";
    }
}
