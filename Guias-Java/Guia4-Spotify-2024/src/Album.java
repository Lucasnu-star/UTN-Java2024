import java.util.Objects;

public class Album {

    //Atributos
    protected String anioPublicacion;
    protected String titulo;
    protected Artista artista;

    //Constructor
    public Album(String anioPublicacion, String titulo, Artista artista) {
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.artista = artista;
    }
    public Album() {}

    //Getters
    public String getAnioPublicacion() {
        return anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public Artista getArtista() {
        return artista;
    }

    //Setters
    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    //ToString
    @Override
    public String toString() {
        return "Album{" +
                "anioPublicacion='" + anioPublicacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }

    //Equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(anioPublicacion, album.anioPublicacion) && Objects.equals(titulo, album.titulo) && Objects.equals(artista, album.artista);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(anioPublicacion, titulo, artista);
    }
}
