package Clases;

/**
 * Esta clase es subclase de Persona, tiene un solo atributo que es la cantidad de perros que adiestro el adiestrador 'int' (No puede ser negativo)
 */

public class Adiestrador extends  Persona{

    //Atributos
    protected int cantidadPerrosAdiestrados;

    //Constructor
    public Adiestrador(String nombre, String dni, int cantidadPerrosAdiestrados) {
        super(nombre, dni);
        this.cantidadPerrosAdiestrados = cantidadPerrosAdiestrados;
    }

    //Getter && Setter
    public int getCantidadPerrosAdiestrados() {
        return cantidadPerrosAdiestrados;
    }
    public void setCantidadPerrosAdiestrados(int cantidadPerrosAdiestrados) {
        this.cantidadPerrosAdiestrados = cantidadPerrosAdiestrados;
    }

    //ToString
    @Override
    public String toString() {
        return "/ Soy un adiestrador " + super.toString() +
                " cantidadPerrosAdiestrados='" + cantidadPerrosAdiestrados + " /";
    }


}