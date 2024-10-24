import ClasesPrueba.Auto;
import ClasesPrueba.Perro;
import ClasesPrueba.Persona;
import Punto1.Almacenamiento;
import Punto3.OperacionMatematica;
import PuntoBonusTrack.Aeropuerto;
import PuntoBonusTrack.Avion;
import PuntoBonusTrack.Hangares;
import PuntoBonusTrack.TipoAviones.Comercial.Comercial;
import PuntoBonusTrack.TipoAviones.Comercial.Servicios;
import PuntoBonusTrack.TipoAviones.DeCarga.DeCarga;
import PuntoBonusTrack.TipoAviones.DeCarga.Productos_Transportar;
import PuntoBonusTrack.TipoAviones.Militar.Militar;
import PuntoBonusTrack.TipoAviones.Militar.eSistemaArma;
import PuntoBonusTrack.TipoAviones.Privado.Privado;
import PuntoBonusTrack.TipoAviones.Privado.eJacuzzi;


public class Main {
    public static void main(String[] args) {
/*
        //Creando clases para el resto del codigo
        Auto auto1= new Auto("Ford" , 2003);
        Auto auto2 = new Auto("Nissan" , 2012);
        Perro perro1= new Perro("Pepe" , 3);
        Perro perro2= new Perro("Nicky" , 2);
        Persona persona1= new Persona("Lucas", 21);
        Persona persona2= new Persona("Valentina", 21);
        Persona persona3= new Persona("Jorge", 45);

        //Punto 1
        Almacenamiento<Object> cajaAuto = new Almacenamiento<>();
        Almacenamiento<Object> cajaPerros = new Almacenamiento<>();
        Almacenamiento<Object> cajaPersonas= new Almacenamiento<>();
        cajaAuto.agregar(auto1);
        cajaAuto.agregar(auto2);
        cajaPerros.agregar(perro1);
        cajaPerros.agregar(perro2);
        cajaPersonas.agregar(persona1);
        cajaPersonas.agregar(persona2);


        //Buscar en caja generica
        System.out.println( cajaPerros.buscar(perro2));
        System.out.println( cajaPersonas.buscar(persona3));

        //Eliminar en caja generica
        cajaAuto.eliminar(auto2);

        // Punto 3
        double total= OperacionMatematica.sumar(2.3, 3.5);

        System.out.println("Suma: " +  total);

        double totalEntero = OperacionMatematica.multiplicar(3,6);

        System.out.println("Multiplicacion: " + totalEntero);

 */

        //Punto bonus
        Aeropuerto aeropuestoAstorPiazzola = new Aeropuerto("Astor Piazzolla", "54353" , "colon 232" , 2);

        Servicios serviciosAvionComercial= new Servicios();
        serviciosAvionComercial.agregarServicio("Azafatas");
        serviciosAvionComercial.agregarServicio("Seguridad a bordo");
        serviciosAvionComercial.agregarServicio("Programas de entretenimiento");
        Comercial avionComercial1= new Comercial("bbd", "pe" , 30, "Bx4" , 40, 6,serviciosAvionComercial );
        Productos_Transportar productosAvionDeCarga= new Productos_Transportar();
        productosAvionDeCarga.agregarProducto("Buker muebles");
        productosAvionDeCarga.agregarProducto("Electronica");
        DeCarga avionDeCarga1= new DeCarga("dfd", "br" , 20, "gt4" , productosAvionDeCarga , 200);
        Militar avionMilitar1 = new Militar("ndf", "dr" , 40 , "ju7" ,15, eSistemaArma.AIRE_AIRE , 350);
        Militar avionMilitar2 = new Militar("gds", "bh" , 30 , "h64" ,12, eSistemaArma.AIRE_TIERRA , 250);
        Privado avionPrivado = new Privado("hh7", "jku" , 30 , "ged5" , 100, eJacuzzi.TRUE, "543453");

        Hangares<Object> hangarAvionesComerciales = new Hangares<>(aeropuestoAstorPiazzola);
        Hangares<Object> hangarAvionesMilitares= new Hangares<>(aeropuestoAstorPiazzola);
        Hangares<Object> hangarAvionesDeCarga= new Hangares<>(aeropuestoAstorPiazzola);


        System.out.println("Agregar avion al hangar de la clase generica");
        hangarAvionesComerciales.agregarAvion(avionComercial1);  // Me tira un NullPointerException


        System.out.println("-------------------");
        System.out.println("Encontrado");
        hangarAvionesComerciales.avionEncontrado(avionComercial1);

        System.out.println("Agregar avion al hangar de la clase generica");
        hangarAvionesMilitares.agregarAvion(avionMilitar1);

        System.out.println("-------------------");
        System.out.println("No encontrado");
        hangarAvionesComerciales.avionEncontrado(avionMilitar2);

        System.out.println("-------------------");
        System.out.println("No se puede agregar por limite de operacion por hangar en el Aeropuerto");
        hangarAvionesMilitares.agregarAvion(avionMilitar2);




        /**
         * No se como manejar que verifique si pueden entrar al aeropuerto y despues mandarlos al hangar de cada uno.
         */
        /*
        aeropuestoAstorPiazzola.ingresarAvionAlAeropuerto(avionComercial1);
        aeropuestoAstorPiazzola.ingresarAvionAlAeropuerto(avionMilitar1);

        System.out.println("Tendria q tirar que no se puede");
        aeropuestoAstorPiazzola.ingresarAvionAlAeropuerto(avionDeCarga1);

        System.out.println("Los aviones dentro del aeropuerto astor piazzola");
        aeropuestoAstorPiazzola.avionesDentroDelAeropuerto();

        System.out.println("Tendria que tirar que no se encuentra");

        aeropuestoAstorPiazzola.retirarAvionDelAeropuerto(avionDeCarga1);

         */

    }


}