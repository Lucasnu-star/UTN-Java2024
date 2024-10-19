public class Autobus extends MetodoTranporte  implements Transporte {
        //Atributos
         protected   int numLinea;



        //Constructores


        public Autobus(int capacidad, int numLinea , TipoTransporte tipo) {
                super(capacidad, tipo);
                this.numLinea = numLinea;
        }



        //Getters

        public int getNumLinea() {
                return numLinea;
        }

        public int getCapacidad() {
                return capacidad;
        }

        public TipoTransporte getTipo() {
                return tipo;
        }


        //Setters


        public void setNumLinea(int numLinea) {
                this.numLinea = numLinea;
        }

        public void setCapacidad(int capacidad) {
                this.capacidad = capacidad;

        }

        public void setTipo(TipoTransporte tipo) {
                this.tipo = tipo;
        }

        //Metodos de la clase Transporte
        @Override
        public int obeterCapacidad() {
         return capacidad;
        }
        public void anunciarParada(String parada)
        {
            System.out.println("La parada es: " + parada);
        }

}
