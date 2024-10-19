import java.util.Objects;

public class Automobile extends Mobile implements ITurnOn,ITurnOf,IAccelerate , IMontaPersonas{

        private int cantidadDePersonas;

        //Constructor
        public Automobile(int model, String brand , int cantidadDePersonas) {
        super(model, brand);
        this.cantidadDePersonas = cantidadDePersonas;
        }
        public Automobile() {}

        //Metodos de la interfaz
        @Override
        public String turnON() {return getClass() + "Turn On";}
        @Override
        public String turnOf() {return  getClass() + "Turn On";}
        @Override
        public String accelerate() {return  getClass() +  "accelerate";}
        @Override
        public String montaPersonas() {return "La cantidad de personas es de " +  cantidadDePersonas;}

        //ToString
        @Override
        public String toString() {
        return "Automobile{" + super.toString() +
                "cantidadDePersonas=" + cantidadDePersonas +
                "} ";
        }

        //Equals && HashCode
        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Automobile that = (Automobile) o;
        return cantidadDePersonas == that.cantidadDePersonas;
        }
        @Override
        public int hashCode() {return Objects.hash(super.hashCode(), cantidadDePersonas);}
}
