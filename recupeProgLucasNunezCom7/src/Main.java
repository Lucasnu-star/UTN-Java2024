import Clases.Auto;
import Clases.Avion;
import Clases.GestionDeFlota;
import Clases.Helicoptero;
import Enums.TIPOAUTO;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Punto 2

        //Punto A
        //Creacion de objetos
        Auto auto1= new Auto("Pegueot" , "ETY" , "2003" , TIPOAUTO.CUPE);
        Auto auto2 = new Auto("Nissa" , "DJU" , "2020" , TIPOAUTO.SEDAN);
        Avion avion1= new Avion("g444" , "CHW" , "2012" , 200);
        Helicoptero helicoptero1 = new Helicoptero("BTW" , "BRG" , "2003 ");
        Helicoptero helicoptero2 = new Helicoptero("ATR" , "DLP" , "2012 ");


        //Metodos de la clase Auto
        //AUTO 1
        System.out.println("Auto 1");
        System.out.println(auto1.toString());
        System.out.println( auto1.darAltaAlquiler());
        System.out.printf(auto1.darBajaAlquiler());

        //AUTO 2
        System.out.println("Auto 2");
        System.out.println(auto2.toString());
        System.out.println( auto2.darAltaAlquiler());
        System.out.printf(auto2.darBajaAlquiler());

        //Metodos de la clase Avion
        System.out.println("Avion 1 ");
        System.out.println(avion1.toString());
        System.out.println(avion1.despegar());
        System.out.println(avion1.aterrizar());

        //Metodos de la clase Helicoptero
        //Helicoptero 1
        System.out.println("Helicoptero 1 ");
        System.out.println(helicoptero1.toString());
        System.out.println(helicoptero1.despegar());
        System.out.println(helicoptero1.aterrizar());

        //Helicoptero 2
        System.out.println("Helicoptero 2 ");
        System.out.println(helicoptero2.toString());
        System.out.println(helicoptero2.despegar());
        System.out.println(helicoptero2.aterrizar());



        //Punto B
        //Gestionamos la flota
        GestionDeFlota listaGestionFlota = new GestionDeFlota();
        listaGestionFlota.ingresarVehiculos(auto1);
        listaGestionFlota.ingresarVehiculos(auto2);
        listaGestionFlota.ingresarVehiculos(avion1);
        listaGestionFlota.ingresarVehiculos(helicoptero1);
        listaGestionFlota.ingresarVehiculos(helicoptero2);

        //Punto C
        //Mostramos la lista de la flota
        System.out.println("Lisa de la gestion de la flota original");
        listaGestionFlota.mostrarFlota();


        //Punto D
        System.out.println("Lista Ordenada por marca");
        listaGestionFlota.mostrarVehiculosOrdenados();


        //Punto E
        //Mostramos la lista de la VEHICULOS que puede despegar y los hacemos despegar.
        System.out.println("Lisa de la gestion de la flota que puden volar");
        listaGestionFlota.mostrarVehiculosVuelan();


    }




}