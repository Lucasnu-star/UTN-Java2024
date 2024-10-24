package PuntoBonusTrack.TipoAviones.DeCarga;

import PuntoBonusTrack.Avion;
import PuntoBonusTrack.TipoAviones.Interfaces.iDeCarga;

public class DeCarga  extends Avion implements iDeCarga{

         //Atributos
        Productos_Transportar productos;
        private int cantidadKilos;

        //Constructor
        public DeCarga(String nombreModelo, String marcar, int capacidadCombustible, String tipoMotor, int cantidadAsientos, Productos_Transportar productos, int cantidadKilos) {
        super(nombreModelo, marcar, capacidadCombustible, tipoMotor, 0);
        this.productos = productos;
        this.cantidadKilos = cantidadKilos;
    }

        //Getters
        public Productos_Transportar getProductos() {
        return productos;
    }
        public int getCantidadKilos() {
        return cantidadKilos;
    }

        //Setters
        public void setProductos(Productos_Transportar productos) {
        this.productos = productos;
    }
        public void setCantidadKilos(int cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

        //ToString
        @Override
        public String toString() {
        return  super.toString() +
                "productos=" + productos +
                ", cantidadKilos=" + cantidadKilos ;
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
        public String descargarContenido() {
        return getNombreModelo() + " descarga contenido";
    }
}
