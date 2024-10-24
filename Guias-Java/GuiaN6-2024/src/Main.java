import ClasesPrueba.Auto;
import ClasesPrueba.Perro;
import ClasesPrueba.Persona;
import Punto1.Almacenamiento;
import Punto3.OperacionMatematica;


public class Main {
    public static void main(String[] args) {
        boolean encontrado;

        //Creando clases para el resto del codigo
        Auto auto1= new Auto("Ford" , 2003);
        Auto auto2 = new Auto("Nissan" , 2012);
        Perro perro1= new Perro("Pepe" , 3);
        Perro perro2= new Perro("Nicky" , 2);
        Persona persona1= new Persona("Lucas", 21);
        Persona persona2= new Persona("Valentina", 21);
        Persona persona3= new Persona("Jorge", 45);

        //Punto 1
        Almacenamiento<Object> cajaAuto = new Almacenamiento<>();
        Almacenamiento<Object> cajaPerros = new Almacenamiento<>();
        Almacenamiento<Object> cajaPersonas= new Almacenamiento<>();
        cajaAuto.agregar(auto1);
        cajaAuto.agregar(auto2);
        cajaPerros.agregar(perro1);
        cajaPerros.agregar(perro2);
        cajaPersonas.agregar(persona1);
        cajaPersonas.agregar(persona2);


        //Buscar en caja generica
        System.out.println( cajaPerros.buscar(perro2));
        System.out.println( cajaPersonas.buscar(persona3));


        //Eliminar en caja generica
        cajaAuto.eliminar(auto2);

        // Punto 3
        double total= OperacionMatematica.sumar(2.3, 3.5);

        System.out.println("Suma: " +  total);

        double totalEntero = OperacionMatematica.multiplicar(3,6);

        System.out.println("Multiplicacion: " + totalEntero);
    }
}