package PuntoBonusTrack.TipoAviones.DeCarga;

import java.util.ArrayList;

public class Productos_Transportar {

    //Atributo
    private ArrayList<String> productosTransportar;

    //Constructor
    public Productos_Transportar() {
        this.productosTransportar =new ArrayList<>();
    }

    //Metodos
    public void agregarProducto(String producto)
    {
        productosTransportar.add(producto);
    }
    public void eliminarProducto(String producto)
    {
        productosTransportar.remove(producto);
    }
}
