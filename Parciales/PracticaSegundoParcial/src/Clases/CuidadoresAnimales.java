package Clases;


import java.util.TreeMap;

public class CuidadoresAnimales {

    //Atributo listaTreeMap
    private TreeMap< Integer  , Cuidador > listaCuidadores;

    //Constructor
    public CuidadoresAnimales() {
        this.listaCuidadores = new TreeMap<>();
    }

    //Metodos
    public void agregarLista(Integer id, Cuidador cuidador) {

        listaCuidadores.put(id, cuidador);
    }

    public void eliminarCuidador(Integer id) {
        listaCuidadores.remove(id);
    }

    //ToString

    @Override
    public String toString() {
        return "CuidadoresAnimales: " +
                "listaCuidadores=" + listaCuidadores ;
    }
}
