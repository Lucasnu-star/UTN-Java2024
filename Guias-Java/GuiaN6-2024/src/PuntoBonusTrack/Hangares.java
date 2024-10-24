package PuntoBonusTrack;

import java.util.ArrayList;

public class Hangares <T> {

    Aeropuerto aeropuerto;
    //Array aviones generico
    private ArrayList<T> hangarAviones = new ArrayList<>();

    //Constuctor
    public Hangares(Aeropuerto aeropuerto) {
        this.hangarAviones = new ArrayList<>();
    }

    //Metodos  Intente asigarle el Aeropuerto y aca usar el metodo ingreAvion que devuelve un Boolea, si es true el avion ingresa el hangar automatiamente sino no. (Esta bien hecho?)
    public  Boolean agregarAvion(T t)
    {
        boolean entro = false;
        entro = aeropuerto.ingresarAvionAlAeropuerto((Avion) t);
        if(entro)
        {
            hangarAviones.add(t);
            System.out.println("Entro al hangar");
        }
        else
        {
            System.out.println("No entro al hangar");
        }

return entro;

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
