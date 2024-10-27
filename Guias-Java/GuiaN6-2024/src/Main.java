import PuntoBonusTrack.Aeropuerto;
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

        // Se crea el aeropuerto astor
        Aeropuerto aeropuertoAstorPiazzolla = new Aeropuerto("Astor Piazzolla", "23232", "colon 333", 5);


     //Crear Aviones

        //Aviones Comerciales
        Servicios serviciosAvionesComerciales= new Servicios();
        serviciosAvionesComerciales.agregarServicio("Comida");
        Comercial avionComercial1= new Comercial("sds" , "wew" , 20, "asedws" , 20, 3, serviciosAvionesComerciales);

        //Aviones DeCarga
        Productos_Transportar productosAvionesDeCarga = new Productos_Transportar();
        productosAvionesDeCarga.agregarProducto("Cajones");
        DeCarga avionDeCarga1= new DeCarga("sadfas" ," wew" , 10, "dfdf" , productosAvionesDeCarga , 12);

        //Aviones Militares
        Militar avioneMilitar1= new Militar("sdfds", "sdsd" , 10, "sds" , 13, eSistemaArma.AIRE_TIERRA, 200);

        //Aviones Privados
        Privado avionPrivado1 = new Privado("sdfasdf" , "wew" , 23, "asdffas" , 20, eJacuzzi.TRUE , "23232");

        //Se crean los hangares
        Hangares<Object> hangarAvionesComerciales= new Hangares<>("Hangar aviones comerciales", aeropuertoAstorPiazzolla);
        Hangares<Object> hangarAvionesDeCarga= new Hangares<>("Hangar aviones de carga", aeropuertoAstorPiazzolla);
        Hangares<Object> hangarAvionesMilitares= new Hangares<>("Hangar aviones militares", aeropuertoAstorPiazzolla);
        Hangares<Object> hangarAvionesPrivados= new Hangares<>("Hangar aviones privados" , aeropuertoAstorPiazzolla);

        //Registrar los hangares en los aeropuertos
        aeropuertoAstorPiazzolla.registrarHangar(hangarAvionesComerciales);
        aeropuertoAstorPiazzolla.registrarHangar(hangarAvionesDeCarga);
        aeropuertoAstorPiazzolla.registrarHangar(hangarAvionesMilitares);
        aeropuertoAstorPiazzolla.registrarHangar(hangarAvionesPrivados);


        //Cuantos hangares hay en el aeropuerto
        System.out.println(aeropuertoAstorPiazzolla.cuantosHangaresAeropuerto());

        //Simulacion si se quiere hacer entrar un Avion llegado desde otra ciudad al aeropuerto

        //Meto un avion de cada tipo para probar

        hangarAvionesComerciales.avionIngresaHangar(avionComercial1);

        hangarAvionesPrivados.avionIngresaHangar(avionPrivado1);

        hangarAvionesMilitares.avionIngresaHangar(avioneMilitar1);

        hangarAvionesDeCarga.avionIngresaHangar(avionDeCarga1);

        //Cuantos aviones x hangar.  Aca hay uno en el hangar Comercial
        System.out.println( hangarAvionesComerciales.cuantosAvionesEnHangar());

        //Se muestra todos los hangares que hay en el Aeropuerto Registrados.
        System.out.println(  aeropuertoAstorPiazzolla.mostrarHangaresAeropuerto());


        //Aca va a tirar todos los aviones que hay en el aeropuerto
        System.out.println(aeropuertoAstorPiazzolla.avionesTotalAeropuerto());

        //Simulacion si puede entrar o no el avion al Aeropuerto

        //Este es el avion que quiere entrar
        Comercial avionComercial2 = new Comercial("sds" , "sdsd" , 10, "sfsf", 15, 3, serviciosAvionesComerciales);

        //Supongamos que el aeropuerto esta llegando al aeropuerto, manda una señal que va a entrar al aeropuerto si puede o no entrar.
        //Se manda la señal
        boolean entra = aeropuertoAstorPiazzolla.confirmarAvionEntraAlAeropuerto();

        if(entra)
            {
                hangarAvionesComerciales.avionIngresaHangar(avionComercial2);
                System.out.println(avionComercial2.aterriza());
                //Tiene q haber 2, eso quiere decir que se incorporo en el hangar
                System.out.println(hangarAvionesComerciales.cuantosAvionesEnHangar());
            }
        else
        {
            System.out.println("El avion no entro al aeropuerto");
        }

        //Vamos a hacer que un avion salga
        hangarAvionesPrivados.avionSaleHangar(avionPrivado1);
        System.out.println(avionPrivado1.despega());

        //Tiene que haber 0 porque lo hicimos despegar
        System.out.println(hangarAvionesPrivados.cuantosAvionesEnHangar());


    }


}