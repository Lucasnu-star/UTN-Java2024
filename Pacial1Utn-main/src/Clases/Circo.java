package Clases;

import java.util.ArrayList;

/**
 * Esta clase va a contener 2 Array List
 * Primer arraylist: Va a contener todas las personas del circo
 * Segundo arraylist: Va a contener todos los perritos adiestrados
 *
 * Esta clase nos va a servir para dsp separar las personas que van a brindar el show en otra clase gestora llamda SHOWTIME.
 */

public class Circo {
    //Atributos (Listas)
    protected ArrayList<Persona> listaCirco;
    protected ArrayList<PerroAdiestrado> listaPerrosAdiestrados;

    //Constructor
    public Circo() {
        this.listaCirco= new ArrayList<>();
        this.listaPerrosAdiestrados= new ArrayList<>();
    }

    //Getters
    public ArrayList<Persona> getListaCirco() {return listaCirco;
    }
    public ArrayList<PerroAdiestrado> getListaPerrosAdiestrados() {return listaPerrosAdiestrados;
    }

    //Metodos
    public void agregarListaCirco(Persona persona)
    {
        listaCirco.add(persona);
    }
    public void agregarPerroAdiestrado(PerroAdiestrado perrito)
    {
        listaPerrosAdiestrados.add(perrito);
    }
    public void mostrarListaPersonasCirco()
    {
        System.out.println(getListaCirco());
    }
    public void mostrarListaPerrosAdiestrados()
    {
        System.out.println(getListaPerrosAdiestrados());
    }

    public int sumarRutinasPayaso()
        {
            int cantidadRutinas=0;

            for(Persona payaso : listaCirco)
            {
                if(payaso instanceof Payaso)
                {

                    cantidadRutinas += ((Payaso) payaso).cantidadRutinas;

                }

            }
            return cantidadRutinas;
        }
}
