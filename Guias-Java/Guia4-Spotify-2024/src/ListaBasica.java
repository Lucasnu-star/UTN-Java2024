import java.sql.SQLOutput;
import java.util.ArrayDeque;

public class ListaBasica implements  IReproducir {

        protected String nombrePlaylist;

    ArrayDeque<Cancion> arrayListaBasica;
    public ListaBasica(String nombrePlaylist) {

        this.nombrePlaylist = nombrePlaylist;
        arrayListaBasica= new ArrayDeque<>();
    }

    //Get y Set
    public String getNombrePlaylist() {
        return nombrePlaylist;
    }
    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    @Override
    public void aniadirCancion(Cancion c) {
        arrayListaBasica.add(c);
    }

    @Override
    public void reproducir() {

       Cancion cancion_reproduce =  arrayListaBasica.pollFirst();
        System.out.println("Cancion que se esta reproduciendo: " + cancion_reproduce);
        assert cancion_reproduce != null; // Se fija si hay una cancion que se reprodujo.
        arrayListaBasica.addLast(cancion_reproduce);
    }

    @Override
    public void  EliminarCancion() {
        System.out.println("No es posible eliminar una cancion, compre el pack DELUXE para realizar esta opcion");

    }

    @Override
    public void verLista() {
        System.out.println(  getNombrePlaylist());
        System.out.println(arrayListaBasica);
    }

}
