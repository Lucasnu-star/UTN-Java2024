import java.util.Objects;

public class Artista{

    //Atributos
    protected String nombre;
    protected String nacionalidad;
    protected String edad;

    //Constructor
    public Artista(String nombre, String nacionalidad, String edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    public Artista() {
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    //ToString
    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    //Equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nombre, artista.nombre) && Objects.equals(nacionalidad, artista.nacionalidad) && Objects.equals(edad, artista.edad);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad, edad);
    }
}
