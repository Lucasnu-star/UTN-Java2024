public class Bicicleta extends MetodoTranporte {
        //Atributos
        protected  String numeroSerie;

        //Constructores
        public Bicicleta( TipoTransporte tipo, String numeroSerie) {
        super(1, tipo);
        this.numeroSerie = numeroSerie;
        }
        @Override
        public int obeterCapacidad() {return 1;}

        public void ajustarAsiento( int altura ) {System.out.println("La altura del asiento fue cambiada a " + altura);}
}
