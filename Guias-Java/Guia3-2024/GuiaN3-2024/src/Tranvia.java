public class Tranvia extends MetodoTranporte implements Transporte {
        //Atributos
        protected  String ruta;


        //Constructores
        public Tranvia(String ruta, int capacidad,  TipoTransporte tipo ) {
                super(capacidad, tipo);
                this.ruta = ruta;
        }

        //Getters
        public String getRuta() {return ruta;}
        public int getCapacidad() {return capacidad;}
        public TipoTransporte getTipo() {return tipo;}

        //Setters
        public void setRuta(String ruta) {this.ruta = ruta;}
        public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
        public void setTipo(TipoTransporte tipo) {this.tipo = tipo;}

        //Metodos
        @Override
        public int obeterCapacidad() {return capacidad;}
}
