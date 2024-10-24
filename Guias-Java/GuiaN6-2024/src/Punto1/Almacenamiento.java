package Punto1;

import java.util.ArrayList;

/**
 * Crear una clase genérica llamada "Almacenamiento" que pueda almacenar
 * cualquier tipo de objeto. Debe tener métodos para agregar, eliminar, y buscar
 * objetos en el almacenamiento. Haz pruebas de tu clase con diferentes tipos
 * de objetos.
 */

public class Almacenamiento <T> {

    //Array Caja generica.
    private ArrayList<T> cajaGenerica;

    //Constructor
    public Almacenamiento() {
        this.cajaGenerica = new ArrayList<>();
    }


    //Metodo Generico
    public void agregar(T t)
    {
        cajaGenerica.add(t);
    }

    public void eliminar(T t)
    {
        cajaGenerica.remove(t);
    }

    public Boolean buscarEnCaja(T t)
    {
        boolean encontrado= false;
        for (T objGenerico : cajaGenerica)
        {
            if (objGenerico.equals(t)) {
                encontrado = true;
                break;
            }
        }

        return encontrado;

    }

    public String buscar(T t)
    {
        boolean encontrado= buscarEnCaja(t);
        if(encontrado)
        {
            return t.toString() + " esta en la caja";

        }
        else
        {

            return t.toString() + " no esta en la caja";

        }
    }




}
