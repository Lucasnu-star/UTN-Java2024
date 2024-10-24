package PuntoBonusTrack;

import java.util.ArrayList;

public class Hangares <T> {


    //Array aviones generico
    private ArrayList<T> hangarAviones = new ArrayList<>();

    //Constuctor
    public Hangares(Aeropuerto aeropuerto) {
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
            System.out.println( t.toString() + " esta en el hangar");
        }
        else{
            System.out.println( t.toString() + " no esta en le hangar");
        }
    }
public void getSize()
    {
        System.out.println(hangarAviones.size());
    }
    //ToString

    @Override
    public String toString() {
        return "Hangares{" +
                "hangarAviones=" + hangarAviones.toString() +
                '}';
    }
}
