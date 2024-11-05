import Archivo.Archivo;
import Clases.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Instacia Zoo
        Zoologico ZoologicoMetropolitao= new Zoologico("Zoologico Metropolitano" , "Colon 323 ");
        // Crear instancias de Aves
        Ave ave1 = new Ave(1, "Loro", 3);
        ave1.ingresarAlimentosLista("Frutas");
        ave1.ingresarAlimentosLista("Semillas");

        Ave ave2 = new Ave(2, "Canario", 2);
        ave2.ingresarAlimentosLista("Semillas");
        ave2.ingresarAlimentosLista("Verduras");

        Ave ave3 = new Ave(3, "Agapornis", 1);
        ave3.ingresarAlimentosLista("Frutas");
        ave3.ingresarAlimentosLista("Semillas");

        Ave ave4 = new Ave(4, "Gorrión", 4);
        ave4.ingresarAlimentosLista("Insectos");
        ave4.ingresarAlimentosLista("Semillas");

        Ave ave5 = new Ave(5, "Pájaro Carpintero", 5);
        ave5.ingresarAlimentosLista("Insectos");
        ave5.ingresarAlimentosLista("Frutos secos");


        // Crear instancias de Mamifero
        Mamifero mamifero1 = new Mamifero(1, "León", 5, "Sabana");
        Mamifero mamifero2 = new Mamifero(2, "Elefante", 10, "Sabana");
        Mamifero mamifero3 = new Mamifero(3, "Oso", 7, "Bosque");
        Mamifero mamifero4 = new Mamifero(4, "Delfín", 4, "Océano");
        Mamifero mamifero5 = new Mamifero(5, "Zorro", 3, "Bosque");

        // Crear instancias de Cuidador
        Cuidador cuidador1 = new Cuidador(5, "Juan Pérez", "Aves");
        Cuidador cuidador2 = new Cuidador(4, "María Gómez", "Mamíferos");
        Cuidador cuidador3 = new Cuidador(3, "Carlos López", "Reptiles");
        Cuidador cuidador4 = new Cuidador(2, "Ana Fernández", "Acuario");
        Cuidador cuidador5 = new Cuidador(1, "Luis Martínez", "Veterinaria");

        //Lista cuidador de animales
        CuidadoresAnimales listaCuidadorAniamles = new CuidadoresAnimales();
        listaCuidadorAniamles.agregarLista(cuidador1.getIdRegistro() , cuidador1);
        listaCuidadorAniamles.agregarLista(cuidador2.getIdRegistro() , cuidador2);
        listaCuidadorAniamles.agregarLista(cuidador3.getIdRegistro() , cuidador3);
        listaCuidadorAniamles.agregarLista(cuidador4.getIdRegistro() , cuidador4);
        listaCuidadorAniamles.agregarLista(cuidador5.getIdRegistro() , cuidador5);

        System.out.println("-----------------");
        System.out.println("Mostrar listaCuidadores treeMap en orden ascendente");
        System.out.println(listaCuidadorAniamles);

        //Habitaculo Mamifero
        Habitaculo<Mamifero> habitaculoMamiferos= new Habitaculo<>();
        habitaculoMamiferos.agregarListaHabitaculo(mamifero1);
        habitaculoMamiferos.agregarListaHabitaculo(mamifero2);
        habitaculoMamiferos.agregarListaHabitaculo(mamifero3);
        habitaculoMamiferos.agregarListaHabitaculo(mamifero4);
        habitaculoMamiferos.agregarListaHabitaculo(mamifero5);

        habitaculoMamiferos.comportamientoAnimales();

        System.out.println("-----------------");
        System.out.println("Mostrar Habitaculos de mamiferos de la clase generica");
        System.out.println(habitaculoMamiferos);

        //Habitaculo Ave
        Habitaculo<Ave> habitaculoAve = new Habitaculo<>();
        habitaculoAve.agregarListaHabitaculo(ave1);
        habitaculoAve.agregarListaHabitaculo(ave2);
        habitaculoAve.agregarListaHabitaculo(ave3);
        habitaculoAve.agregarListaHabitaculo(ave4);
        habitaculoAve.agregarListaHabitaculo(ave5);

        habitaculoAve.comportamientoAnimales();

        System.out.println("-----------------");
        System.out.println("Mostrar Habitaculos de aves de la clase generica");
        System.out.println(habitaculoAve.toString());


        //Verificacion si anda el exception
        /*
        Mamifero mamifero6 = new Mamifero(6, "Tigre", 6, "Selva");
        habitaculoMamiferos.agregarListaHabitaculo(mamifero6);

         */

        //Crear Archivos de aves
        Archivo.crearArchivo("aves.json" , habitaculoAve.getListaAnimales());

        //Lista ave extraido del archivo
        HashSet<Ave> listaAvesArchivo = new HashSet<>();
        listaAvesArchivo = Archivo.listaAve("aves.json");
        System.out.println(listaAvesArchivo);

    }
}