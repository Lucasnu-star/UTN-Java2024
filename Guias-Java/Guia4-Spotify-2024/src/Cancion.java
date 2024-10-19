import java.net.CacheRequest;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Cancion{



    //Atributos
    protected String nombre;
    protected double duracionCancion; // Minutos
    protected GENERO genero;
    protected Album album;
    protected String nombreArtistaInvitado;

    //Constructores
    public Cancion(String nombre, double duracionCancion, GENERO genero, Album album, String nombreArtistaInvitado) {
        this.nombre = nombre;
        this.duracionCancion = duracionCancion;
        this.genero = genero;
        this.album = album;
        this.nombreArtistaInvitado = nombreArtistaInvitado;

    }  // Si es que tiene artista invitado
    public Cancion(String nombre, Album album, GENERO genero, double duracionCancion) {
        this.nombre = nombre;
        this.album = album;
        this.genero = genero;
        this.duracionCancion = duracionCancion;
        this.nombreArtistaInvitado = "No tiene";

    } // Sin artista invitado

    //Getters
    public String getNombre() {
        return nombre;
    }
    public double getDuracionCancion() {
        return duracionCancion;
    }
    public GENERO getGenero() {
        return genero;
    }
    public Album getAlbum() {
        return album;
    }
    public String getNombreArtistaInvitado() {
        return nombreArtistaInvitado;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracionCancion(double duracionCancion) {
        this.duracionCancion = duracionCancion;
    }
    public void setGenero(GENERO genero) {
        this.genero = genero;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public void setNombreArtistaInvitado(String nombreArtistaInvitado) {
        this.nombreArtistaInvitado = nombreArtistaInvitado;
    }

    //ToString
    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracionCancion=" + duracionCancion +
                ", genero=" + genero +
                ", album=" + album +
                ", nombreArtistaInvitado='" + nombreArtistaInvitado + '\'' +
                '}';
    } // Con artista invitado

    //Equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Double.compare(duracionCancion, cancion.duracionCancion) == 0 && Objects.equals(nombre, cancion.nombre) && genero == cancion.genero && Objects.equals(album, cancion.album) && Objects.equals(nombreArtistaInvitado, cancion.nombreArtistaInvitado);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, duracionCancion, genero, album, nombreArtistaInvitado);
    }
}
