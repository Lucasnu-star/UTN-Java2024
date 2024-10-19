package Clases;
import Interfaces.IShow;

/**
 * Esta clase no es subclase de nadie, es independiente. Tiene un contador de cuantos perritos adiestrados hay con su edad.
 */


public class PerroAdiestrado implements IShow {

    //Constante, contador de perros
    public static int CONTADOR_PERROS = 1;

    //Atributos
    protected int id;
    protected int edad;

    //Constructor
    public PerroAdiestrado(int edad) {
        id= CONTADOR_PERROS++;
        this.edad = edad;
    }

    //Getter && Setter
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //ToString
    @Override
    public String toString() {
        return "/ Soy el perro adiestrado numero " +id +
                ", y tengo " + edad + " años / ";
    }

    //Metodos
    @Override
    public String ensayar() {
        return "Soy un perrito adiestrado N: " +  id + " que esta ensayando";
    }

    @Override
    public String probarseVestuario() {
        return "Me estoy probando el vestuario para el show";
    }

    @Override
    public String brindarShow() {
        return "Soy el perrito n: " +  id  + " que esta dando un gran show! ";
    }


}
