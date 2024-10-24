package Punto3;

import java.util.Random;

/**
 * Crear una clase genérica llamada "OperacionMatematica" que pueda realizar
 * operaciones matemáticas simples (suma, resta, multiplicación, división) con
 * cualquier tipo de número (enteros, decimales, etc.). Debe tener métodos para
 * cada operación y para establecer los números de entrada. Haz pruebas de
 * tu clase con diferentes tipos de números.
 */
public final class  OperacionMatematica <N> {

    public OperacionMatematica() {}

    //El N extends Number es para que nos deje hacer la operacion matematica entre los dos tipos de numeros genericos
    public static <N extends Number> double sumar(N primerNum, N segundoNum)
    {
        return primerNum.doubleValue() + segundoNum.doubleValue();
    }

    public static <N extends Number> double restar(N primerNum, N segundoNum)
    {
        return primerNum.doubleValue() - segundoNum.doubleValue();
    }

    public static <N extends Number> double multiplicar(N primerNum, N segundoNum)
    {
        return primerNum.doubleValue() * segundoNum.doubleValue();
    }
    public static <N extends Number> double dividir(N primerNum, N segundoNum)
    {
        return primerNum.doubleValue() / segundoNum.doubleValue();
    }
}
