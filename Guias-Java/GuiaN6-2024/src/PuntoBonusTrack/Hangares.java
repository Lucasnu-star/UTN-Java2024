package PuntoBonusTrack;

import java.util.ArrayList;

public class Hangares <T> {

    //Array aviones generico
    private ArrayList<T> hangarAviones = new ArrayList<>();

    //Constuctor
    public Hangares() {
        this.hangarAviones = new ArrayList<>();
    }

    //Metodos
    public  void agregarAvion(T t)
    {
        hangarAviones.add(t);
    }

    public void eliminarAvionHangar(T t)
    {
        hangarAviones.remove(t);
    }

    public boolean buscarAvionHangar(T t)
    {
        boolean encontrado=false;
        for(T tBuscar : hangarAviones)
        {
            if(tBuscar.equals(t))
            {
                encontrado= true;
                break;
            }
        }
        return encontrado;
    }

    public void avionEncontrado(T t)
    {
        boolean encontrado= buscarAvionHangar(t);
        if(encontrado)
        {
            System.out.println("El avion esta en el hangar");
        }
        else{
            System.out.println("El avion no esta en le hangar");
        }
    }
}
