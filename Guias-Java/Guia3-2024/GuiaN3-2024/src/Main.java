import java.sql.SQLOutput;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        /*
        MetodoTranporte autobus1 = new Autobus(205, 100 , TipoTransporte.AUTOBUS );
        relizarConsignaPunto1(autobus1);
        MetodoTranporte tranvia1 = new Tranvia("Buenos aires", 250 , TipoTransporte.TRANVIA);
        relizarConsignaPunto1(tranvia1);
        MetodoTranporte bicileta1 = new Bicicleta(TipoTransporte.BICICLETA,  "12");
        relizarConsignaPunto1(bicileta1);
        */

        //Ejercicio 2
        ArrayList <Animal> listaAnimales = new ArrayList<>();
        Animal animal1= new Pato(eTipoAnimal.PATO, true );
        Animal animal2= new Murcielago(eTipoAnimal.MURCIELAGO, false );
        Animal animal3= new Pez(eTipoAnimal.PEZ, true );

        System.out.println("----------");
        System.out.println(animal1.getTipo());
        realizarConsgnaPunto2(animal1, listaAnimales);
        System.out.println("----------");
        System.out.println(animal2.getTipo());
        realizarConsgnaPunto2(animal2, listaAnimales);
        System.out.println("----------");
        System.out.println(animal3.getTipo());
        realizarConsgnaPunto2(animal3, listaAnimales);


    }

    public static void realizarConsgnaPunto2(Animal a , ArrayList<Animal> arrayAnim)
    {

        arrayAnim = new ArrayList<>();

        arrayAnim.add(a);

        for(Animal animales : arrayAnim)
        {
            animales.comer();
            animales.caminar();
            animales.nadar();
            animales.volar();
            Boolean danger = animales.getDanger();
            if(danger)
            {
                System.out.println("-----");
                System.out.println("Situacion de peligro");

                animales.comunicacionDanger();
                System.out.println("Movimiento Especial");
                animales.movimientoEspecial();
                System.out.println("-----");

            }
            else
            {

                animales.comunicacionNotDanger();
            }

            animales.dormir();


        }

    }

    public static void relizarConsignaPunto1(MetodoTranporte a) {
        TipoTransporte tipo= a.getTipo();
        System.out.println("----------");
        System.out.println(tipo);
        a.arrancar();
        int capacidad =  a.obeterCapacidad();
        System.out.println("Capacidad " + capacidad);
        if(a instanceof Autobus) {
            ((Autobus)a).anunciarParada("Mar del Plata");
        }
        else if(a instanceof Bicicleta)
        {
            ((Bicicleta)a).ajustarAsiento(3);
        }
        a.detener();



    }

}
