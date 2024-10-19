public class Animal implements iMovilidad, iComunicacion, iNecesidadesBasicas, iMovimientoEspecial{

    //Atributos
    protected eTipoAnimal tipo;
    protected Boolean danger;

    //Constructor
    public Animal(eTipoAnimal tipo, Boolean danger) {
        this.tipo = tipo;
        this.danger = danger;
    }

    //Getters
    public eTipoAnimal getTipo() {return tipo;}
    public Boolean getDanger() {return danger;}

    //Setters
    public void setTipo(eTipoAnimal tipo) {this.tipo = tipo;}
    public void setDanger(Boolean danger) {this.danger = danger;}

    //Metodos de las Interfaz iMovilidad
    @Override
    public void caminar() {
        System.out.println("Caminar");
    }
    @Override
    public void nadar() {
        System.out.println("Nadar");
    }
    @Override public void volar() {
        System.out.println("Vuela");
    }

    //Metodos de las Interfaz iNecesidadesBasicas
    @Override
    public void comer() {
        System.out.println("Comer");
    }
    @Override
    public void dormir() {
        System.out.println("Duerme");
    }

    //Metodos de las Interfaz iComunicacion  // Preguntar como funciona bien los parametros en las interfaces.
    @Override
    public void comunicacionDanger() {System.out.println("Comunicacion amenzante");}
    public void comunicacionNotDanger(){System.out.println("Comunicacion paficicamente");}

    @Override
    public void detallarMovimientoEspecial() {
        System.out.println("null");
    }

    @Override
    public void movimientoEspecial() {
        System.out.println("null");
    }
}
