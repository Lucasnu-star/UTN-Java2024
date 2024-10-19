public class Murcielago extends Animal implements iMovimientoEspecial {

    //Constructor
    public Murcielago(eTipoAnimal tipo, Boolean danger) {
        super(tipo, danger);
    }

    // Esta clase solo llama a la funcion nadar (porque un murcielago no puede nadar xd)

    @Override
    public void nadar() {
        System.out.println("El murcielago no nada capo");
    }
    /**
     * Este metodo cuando se llame en el main, tendra que haber un chequeo si el animal esta en modo "danger" para tirar el ataque especial.
     */
    @Override
    public void movimientoEspecial() {
        System.out.println("Hipnotizador Temporal");
    }

    @Override
    public void detallarMovimientoEspecial() {
        System.out.println("Hipnotizador Temporal: Este ataque especial sirve para que los depredadores queden hipnotizados e inmovilizados por 10 minutos y el murcielago pueda escapar libremente.");
    }

    // Los murcielagos en situacion de peligro se quedan en silencio para no ser detectados.
    @Override
    public void comunicacionDanger() {
        System.out.println("Silencio o inmovilidad");
    }

    // Sonidos de ecolocacion emiten los murcielagos para comunicarse entre ellos.
    @Override
    public void comunicacionNotDanger() {
        System.out.println("Sonidos de ecolocación");
    }
}
