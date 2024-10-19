import java.util.LinkedList;
import java.util.Scanner;

public class ListaDeluxe implements IReproducir{

    //Atributos
    protected String nombrePlaylistDeluxe;
    protected LinkedList<Cancion> miListaDeluxe;

    //Constructor
    public ListaDeluxe(String nombrePlaylistDeluxe) {
        this.nombrePlaylistDeluxe = nombrePlaylistDeluxe;
        miListaDeluxe = new LinkedList<>();
    }

    //Get y Set
    public String getNombrePlaylistDeluxe() {
        return nombrePlaylistDeluxe;
    }
    public void setNombrePlaylistDeluxe(String nombrePlaylistDeluxe) {
        this.nombrePlaylistDeluxe = nombrePlaylistDeluxe;
    }

    //Metodos


    @Override
    public void aniadirCancion(Cancion c) {
        miListaDeluxe.add(c);
    }

    @Override
    public void verLista() {
        System.out.println(getNombrePlaylistDeluxe());
        System.out.println(miListaDeluxe);
    }

    @Override
    public void reproducir() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la posicion de la cancion que quieras reproducir");
        int cancionSeleccionada = teclado.nextInt();
        System.out.println(miListaDeluxe.get(cancionSeleccionada - 1 ).toString());
    }

    @Override
    public void EliminarCancion() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la posicion de la cancion que quieras eliminar");
        int cancionSeleccionadaEliminar = teclado.nextInt();
        System.out.println("Esta cancion fue eliminada de su playlist" + miListaDeluxe.get(cancionSeleccionadaEliminar - 1 ).getNombre()) ;
        miListaDeluxe.remove(cancionSeleccionadaEliminar - 1 );
    }
}
