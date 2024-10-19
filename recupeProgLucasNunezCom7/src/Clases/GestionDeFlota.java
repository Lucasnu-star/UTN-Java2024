package Clases;

import Interfaces.IVehiculoAereo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Esta clase sirve como gestion de flota donde usamos un linkedList que permite repetidos e inusualmente vamos a sacar datos e ingresar datos, por lo tanto no vamos a necesitar sacar datos del medio o ingresar.
 *
 */
public class GestionDeFlota extends Vehiculo{

    //Atributo
    private LinkedList<Vehiculo> listaFlota;

    //Constructor
    public GestionDeFlota() {
        this.listaFlota =new LinkedList<>();

    }

    //Metodos
    public void ingresarVehiculos(Vehiculo vehiculoGestion)
    {
        listaFlota.add(vehiculoGestion);
        // listaFlota.sort(Vehiculo::compareTo); // Si comentamos esta linea los vehiculos van a aparecer en orden como los implementamos en el main


    }
    public void mostrarFlota()
    {
        System.out.println(listaFlota);
    }
    public void mostrarVehiculosVuelan() {

        for (Vehiculo list : listaFlota)
            {
                if(list instanceof IVehiculoAereo)
                {
                    System.out.println(list.toString());
                    System.out.println(((IVehiculoAereo) list).despegar());
                }
            }
    }

    public void mostrarVehiculosOrdenados()
        {
            listaFlota.sort(Vehiculo::compareTo);
            System.out.println(listaFlota);
        }

}
