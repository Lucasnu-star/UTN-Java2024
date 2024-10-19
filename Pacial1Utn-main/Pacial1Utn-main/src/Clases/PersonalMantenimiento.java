package Clases;

import Interfaces.IPersonalMantenimiento;

public class PersonalMantenimiento extends Persona implements IPersonalMantenimiento {

    //Constructor
    public PersonalMantenimiento(String nombre, String dni) {
        super(nombre, dni);
    }

    //ToString

    @Override
    public String toString() {
        return "/ Soy del personal de mantenimiento" + super.toString()  + "/";
    }

    //Metodos
    @Override
    public String desarmarCarpa() {
        return "El personal de mantenimiento: " + nombre + " desarma la carpa";
    }
    @Override
    public String armarCarpa() {
        return "El personal de mantenimiento: " + nombre + " arma la carpa";
    }

}
