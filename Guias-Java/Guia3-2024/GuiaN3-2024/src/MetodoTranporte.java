public abstract   class MetodoTranporte implements Transporte {
    protected  int capacidad;
    protected  TipoTransporte tipo;
 // construc


    public MetodoTranporte(int capacidad, TipoTransporte tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    // getter


    public int getCapacidad() {
        return capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    // Metodos de la interfaz Tranposrte para que las subclases las hereden y se realize el polimosfirmo con herencia
    @Override
    public void arrancar() {
        System.out.println("Arranca");
    }
    @Override
    public void detener() {
        System.out.println("Se detiene");
    }
    @Override
    public int obeterCapacidad() {
        return 0;
    }




}
