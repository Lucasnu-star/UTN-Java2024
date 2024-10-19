import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Artista artista1= new Artista("Lucas", "Argentino", "22");
        Album album1 = new Album("2019", "alala", artista1);
        Cancion cancion1 = new Cancion("Los Monos", 3.5, GENERO.HIPHOP, album1,  "Valentina");
        Cancion cancion2 = new Cancion("Los Tigres", 1.5, GENERO.CLASICA, album1,  "Duki");
        Cancion cancion3 = new Cancion("Los Pandas", album1, GENERO.METAL , 2.5);
        ListaBasica miPlayList = new ListaBasica("Playlist Lucas");


        //Lista Basica
        miPlayList.aniadirCancion(cancion1);
        miPlayList.aniadirCancion(cancion2);
        miPlayList.aniadirCancion(cancion3);
        System.out.println("Lista Original");
        miPlayList.verLista();
        System.out.println("Reproducir ultima cancion de mi lista");
        miPlayList.reproducir();
        System.out.println("Lista con la primera cancion al final");
        miPlayList.verLista();

        //Lista Deluxe
        ListaDeluxe miListaDeluxe = new ListaDeluxe("Playlist Deluxe Lucas");
        miListaDeluxe.aniadirCancion(cancion1);
        miListaDeluxe.aniadirCancion(cancion2);
        miListaDeluxe.aniadirCancion(cancion3);
        System.out.println("Lista original Deluxe");
        miListaDeluxe.verLista();
        miListaDeluxe.reproducir();
        miListaDeluxe.EliminarCancion();
        miListaDeluxe.verLista();
    }




}