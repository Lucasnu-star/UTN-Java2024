import java.util.ArrayList;
import java.util.stream.Collectors;

public class Biblioteca {


   public ArrayList<Libro> libro= new ArrayList<>();  // Estoy creando un arraylist de una libreria que me ayuda a guardar datos directos de la clase Libro

    public Libro agregarLibro( String titulo, String autor , int precio, int copias ) {
        Libro l = new Libro( titulo,autor,precio,copias);

        libro.add(l);
        return l;

    }

    public void mostrarLibros()
    {
        for (Libro i : libro) {
            i.mostrarLibros();
        }
        //libro.stream().forEach( a -> a.mostrarLibros());
    }





}
