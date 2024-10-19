import java.util.Objects;

public abstract class Mobile{

        //Atributos
        private int model;
        private String brand;

        //Constructor
        public Mobile(int model, String brand) {
            this.model = model;
            this.brand = brand;
        }
        public Mobile() {}

        //Getter
        public int getModel() {return model;}
        public String getBrand() {return brand;}

        //Setter
        public void setModel(int model) {this.model = model;}
        public void setBrand(String brand) {this.brand = brand;}

        //ToString
        @Override
        public String toString() {
        return "Mobile{" +
                "model=" + model +
                ", brand='" + brand + '\'' +
                '}';
        }

        //Equals && HashCode
        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return model == mobile.model && Objects.equals(brand, mobile.brand);
        }

        @Override
        public int hashCode() {return Objects.hash(model, brand);}

}
