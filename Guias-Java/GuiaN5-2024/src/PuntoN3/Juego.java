package PuntoN3;

import java.util.Random;

/**
 * Escribe un programa que juegue con el usuario a adivinar un número.
 * El ordenador debe generar un número entre 1 y 500, y el usuario tiene que
 * intentar adivinarlo.
 * Para ello, cada vez que el usuario introduce un valor, el ordenador debe
 * decirle al usuario si el número que tiene que adivinar es mayor o menor que el
 * que ha introducido el usuario. Cuando consiga adivinarlo, debe indicarlo e
 * imprimir en pantalla el número de veces que el usuario ha intentado adivinar
 * el número.
 *
 */
public class Juego {


    //Atributos
    private Random random = new Random();
    private int contador =0;
    private int numRandom;

    //Constructor
    public Juego( ) {

        numRandom = random.nextInt(500) + 1;
    }

    //Getters
    public int getContador() {
        return contador;
    }
    public int getNumRandom() {
        return numRandom;
    }

    public boolean adivinarJuego(int numElegido)
    {
        if(numElegido > numRandom)
        {
            System.out.printf("El numero tiene que ser mas bajo");
            contador++;

        }
        else if(numElegido > numRandom)
        {
            System.out.printf("El numero tiene que ser mas alto");
            contador++;

        }
        if(numElegido<0)
        {


            System.out.printf("El num es negativo");
            contador++;
        }
        else
        {
            contador++;
            System.out.printf("Ganaste! \n" + "Adivinar el numero te llevo " + getContador() + " intentos");
            return true;
        }
        return false;
    }
}
