package PuntoBonusTrack.TipoAviones.Comercial;

import java.util.ArrayList;

public class Servicios {
    private ArrayList<String> listaServicios;

    //Constructor
    public Servicios() {
        this.listaServicios = new ArrayList<>();
    }

    //Metodos
    public void agregarServicio(String servicio)
    {
        listaServicios.add(servicio);
    }
    public void eliminarServicio (String servicio)
    {
        listaServicios.remove(servicio);
    }
}
