package Clases;

public class Zoologico {

    //Atributo
    private String nombreZoo;
    private String direccionZoo;

    //Constructores
    public Zoologico(String nombreZoo, String direccionZoo) {
        this.nombreZoo = nombreZoo;
        this.direccionZoo = direccionZoo;
    }

    //Getters
    public String getNombreZoo() {
        return nombreZoo;
    }
    public String getDireccionZoo() {
        return direccionZoo;
    }

    //Setters
    public void setNombreZoo(String nombreZoo) {
        this.nombreZoo = nombreZoo;
    }
    public void setDireccionZoo(String direccionZoo) {
        this.direccionZoo = direccionZoo;
    }

    //ToString
    @Override
    public String toString() {
        return "Zoologico{" +
                "nombreZoo='" + nombreZoo + '\'' +
                ", direccionZoo='" + direccionZoo + '\'' +
                '}';
    }

}
