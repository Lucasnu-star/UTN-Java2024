package Clases;

import Clases.Excepciones.ExcepcionCapacidadHabitaculoExcedida;

import java.util.HashSet;

public class Habitaculo <T extends Animal>{

    //Atributo lista generica
    private HashSet<T> listaAnimales;
    private int capacidadAnimalesHabitaculo;

    //Constructor
    public Habitaculo() {

        this.listaAnimales = new HashSet<>();
        this.capacidadAnimalesHabitaculo = 5;
    }

    //Metodos
    public boolean verificarSiEntraAnimal(T t)
    {

        return listaAnimales.size() < capacidadAnimalesHabitaculo;
    }

    public void agregarListaHabitaculo(T t) throws ExcepcionCapacidadHabitaculoExcedida
    {
        if(verificarSiEntraAnimal(t))
            {
                listaAnimales.add(t);
            }
        else
        {
            throw new ExcepcionCapacidadHabitaculoExcedida( t.getEspecie() + " no puede ser agregado al habitaculo");
        }

    }

    public void eliminarListaHabitaculo(T t)
    {
        listaAnimales.remove(t);
    }

    public void comportamientoAnimales()
    {
            for(T t : listaAnimales)
                {
                    System.out.println("------------");
                    System.out.println(t.comer() );
                    System.out.println(t.dormir() );
                    System.out.println(t.aparearse() );
                    System.out.println("------------");
                }
    }

    //ToString

    @Override
    public String toString() {
        return "Habitaculo: " +
                "listaAnimales=" + listaAnimales ;
    }
}