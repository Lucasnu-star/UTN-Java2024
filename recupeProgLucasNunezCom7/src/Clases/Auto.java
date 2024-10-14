package Clases;

import Enums.TIPOAUTO;
import Interfaces.IVehiculo;

/**
 * Esta clase extiende de la clase vehiculo
 * Tiene su atributo propio que es el tipo de auto (ENUM)
 *
 */
public class Auto extends Vehiculo implements IVehiculo {

    //Atributos
    private TIPOAUTO tipoAuto;

    //Constructores
    public Auto(String marca, String modelo, String anio, TIPOAUTO tipoAuto) {
        super(marca, modelo, anio);
        this.tipoAuto = tipoAuto;
    }
    public Auto() {

    }

    //Getter & Setter
    public TIPOAUTO getTipoAuto() {
        return tipoAuto;
    }
    public void setTipoAuto(TIPOAUTO tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() +
                "tipoAuto=" + tipoAuto;
    }



}
