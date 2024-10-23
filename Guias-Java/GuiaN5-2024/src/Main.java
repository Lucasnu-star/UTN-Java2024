import Punto4.Colegio;
import Punto4.Estudiante;
import Punto4.Exepciones.ExcepcionAlumnoNoEncontrado;
import Punto4.Exepciones.ExcepcionNoTieneNacionalidad;
import PuntoN3.ExcepcionNumNegativo;
import PuntoN3.Juego;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        int numeroElegido;
        boolean gano= false;
        Juego juego= new Juego();

        System.out.printf(" Bienvenidos a adivina el numero!  \n\n" );

        while(gano == false)
        {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.printf("\n Ingrese un entero: ");
                numeroElegido = teclado.nextInt();
                gano = juego.adivinarJuego(numeroElegido);


            }catch (InputMismatchException ex)
            {
                System.out.printf("Ingrese un numero y no una letra");
            }


        }

         */

        Estudiante est1= new Estudiante("Lucas", "Argentino");
        Estudiante est2= new Estudiante("Valentina", "Peru");
        Estudiante est3= new Estudiante("Ricardo", "Peru");


        Colegio colegio1= new Colegio();
        colegio1.agregarAlumno(est1);
        colegio1.agregarAlumno(est2);
        colegio1.agregarAlumno(est3);
        try {
            colegio1.eliminarAlumno(est1);
        } catch (ExcepcionAlumnoNoEncontrado e) {
            System.out.println(e.getMessage());
        }

        colegio1.contarNacionalidades();
        colegio1.verNacionalidades();

        try {
            String nacionalidad = colegio1.buscarNacionalidad("Peru");
            System.out.println(nacionalidad);
        } catch (ExcepcionNoTieneNacionalidad e) {
            System.out.println(e.getMessage());
        }







    }
}