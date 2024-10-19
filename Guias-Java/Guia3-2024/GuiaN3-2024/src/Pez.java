public class Pez extends Animal implements iMovimientoEspecial {

    // Constructor
    public Pez(eTipoAnimal tipo, Boolean danger) {
        super(tipo, danger);
    }

    // En esta clase se llama el caminar y volar no tengo que explicar el porque

    @Override
    public void caminar() {
        System.out.println("El pez no puede caminar (A no ser que este en peligro...)");
    }

    @Override
    public void volar() {
        System.out.println("El pez no puede volar(A no ser...)");
    }

    /**
     * Este metodo cuando se llame en el main, tendra que haber un chequeo si el animal esta en modo "danger" para tirar el ataque especial.
     */
    @Override
    public void movimientoEspecial() {
        System.out.println("Super mega pez (obtienes atributos: Caminar y Volar)");
    }

    @Override
    public void detallarMovimientoEspecial() {
        System.out.println("Super Mega Pez: En este estado el pez va a obtener bonificaciones adicionales, como hacerse mas grande permitiendole poder caminar y hasta volar! El efecto dura un tiempo prolongado si es que no toca el agua.");
    }

    @Override
    public void comunicacionDanger() {
        System.out.println("Glu Glu Gluuuu!");
    }

    @Override
    public void comunicacionNotDanger() {
        System.out.println("Glu Glu");
    }
}
