public class ItemVenta {

    // ATRIBUTOS
    public static int id = 1;
    private int idVenta;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // GETTER

    public int getIdVenta() {return idVenta;}
    public String getDescripcion() {return descripcion;}
    public int getCantidad() {return cantidad;}
    public double getPrecioUnitario() {return precioUnitario;}

    // SETTERS

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}

    // METODOS

    public void  generarVenta (String descripcion, int cantidad, double precioUnitario)
    {
        idVenta = ItemVenta.id++;
        this.descripcion= descripcion;
        this.cantidad= cantidad;
        this.precioUnitario= precioUnitario;

    }

    public int calcularPrecioTotal()
    {
        double calculoFinal = precioUnitario * cantidad;
        return (int)calculoFinal;
    }

    public String representacionCadena(int id, String des, int canti, double pUnitario, int pTotal)
    {
        return "Id:" + id + "Descripcion:" + des + "Cantidad:" + canti + "Precio Unitario:" + pUnitario + "Precio Total:" + pTotal;

    }
}
