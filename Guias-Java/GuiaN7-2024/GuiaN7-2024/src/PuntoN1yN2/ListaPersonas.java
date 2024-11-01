package PuntoN1yN2;

import java.util.ArrayList;

public class ListaPersonas {

    //Atr
    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        this.listaPersonas = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void agregarPersonas(Persona personas)
    {
        listaPersonas.add(personas);
    }

    public void eliminarPersona(Persona persona)
    {
        for (Persona personaE : listaPersonas)
        {
            if(personaE.equals(persona))
            {
                listaPersonas.remove(persona);
            }
        }
    }
}
