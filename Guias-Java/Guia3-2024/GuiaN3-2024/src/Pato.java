public class Pato  extends Animal implements iMovimientoEspecial{

    // Constructor
    public Pato(eTipoAnimal tipo, Boolean danger) {
        super(tipo, danger);
    }

    //El pato puede caminar, volar y nadar asi que no se le llama a las funciones para sobreescribirlas


    /**
     * Este metodo cuando se llame en el main, tendra que haber un chequeo si el animal esta en modo "danger" para tirar el ataque especial.
     */
    @Override
    public void movimientoEspecial() {
        System.out.println("Lanzamiento de patitos de hule");
    }

    @Override
    public void detallarMovimientoEspecial( ) {System.out.println("Lanzamiento de patitos de hule: Este movimiento especial sirve para ahuyentar y aniquilar a los depredadores, consta con una municion de 15 patitos de hule fuirosos que si te alcanzan, hacen mucho daño");}

    @Override
    public void comunicacionDanger() {
        System.out.println("Cuak Cuak Cuak!");
    }

    @Override
    public void comunicacionNotDanger() {
        System.out.println("Cuak Cuak :)");


    }
}


