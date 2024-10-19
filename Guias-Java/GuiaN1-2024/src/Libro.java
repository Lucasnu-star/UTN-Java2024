public class Libro {

    // ATRIBUTOS
    public static int id=1 ; // Esta variable es la que me ayuda a incrementar el id de los usuarios
    private int idLibro;
    private String titulo;
    private String autor;
    private int precio;
    private int cantidadDisponibles;

    // GETTERS

    public int getIdLibro() { return idLibro; }
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getPrecio() {return precio;}
    public int getCantidadDisponibles() {return cantidadDisponibles;}

    // SETTERS

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setPrecio(int precio) {this.precio = precio;}
    public void setCantidadDisponibles(int cantidadDisponibles) {this.cantidadDisponibles = cantidadDisponibles;}

    // METHODS


    public Libro( String titulo, String autor, int precio, int cantidadDisponibles) {
        this.idLibro = Libro.id++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadDisponibles = cantidadDisponibles;
    }


    public void venderLibros(int cantLibros)
    {
        if(cantidadDisponibles > cantLibros)
        {
            cantidadDisponibles = cantidadDisponibles - cantLibros;
        }
        else
        {
            System.out.println("La cantidad de libros de  '" + titulo + "' que desea llevarse excede el limite de la cantidad de libros en la biblioteca, solo existen " + cantidadDisponibles + " disponibles");
        }
    }
    public void incremetarCopiasLibro (int incremetarLibros)
    {
        cantidadDisponibles += incremetarLibros;
    }
    public void mostrarLibros()
    {
        System.out.println(this.idLibro + this.autor + this.titulo + this.precio + this.cantidadDisponibles );

    }
}
