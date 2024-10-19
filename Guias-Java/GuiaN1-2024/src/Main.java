import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        //Scanner teclado = new Scanner(System.in);

        //                                           GUIA #1                                            //

        /*  PUNTO NUMERO 1

          Empleado empleado1 = new Empleado();
          empleado1.crearPersona("Carlos", "Gutierrez", "23456345", 2500);
          empleado1.calcularSalarioSemanal();
          empleado1.calcularSalarioAnual();
          empleado1.aumentarSalario(15);
          String e1=empleado1.mostrarEmpleado();
          System.out.println(e1);

          Empleado empleado2 = new Empleado();
          empleado2.crearPersona("Ana", "Sánchez", "34234123", 2700);
          empleado2.calcularSalarioSemanal();
          empleado2.calcularSalarioAnual();
          String e2= empleado2.mostrarEmpleado();
          System.out.println(e2);
        */

        /*  PUNTO NUMERO 2

      // PRUEBA CON USUARIO QUE SI PUEDE SACAR PLATA DEL BANCO

         Banco user1 = new Banco();
         user1.createUser("Lucas", 3000);
         double montoDepositado = user1.depositMoney(1000);
         System.out.println("Monto con deposito:" + montoDepositado);
         double montoRetirado = user1.withdrawMoney(1000);
         System.out.println("Monto con retiro:" + montoRetirado);
         String showUserr= user1.showUser();
         System.out.println(showUserr);

      // PRUEBA CON USUARIO QUE NO PUEDE SACAR PLATA DEL BANCO

         Banco user2 = new Banco();
         user2.createUser("Mateo", 1000);
         double montoDepositado2 = user2.depositMoney(1000);
         System.out.println("Monto con deposito:" + montoDepositado2);
         double montoRetirado2 = user2.withdrawMoney(3000);
         System.out.println("Monto con retiro:" + montoRetirado2);
         String showUserr2= user2.showUser();
         System.out.println(showUserr2);
        */

        /*  PUNTO NUMERO 3
        Biblioteca libro1 = new Biblioteca();
        libro1.asignarLibro("Don quijote de la mancha", "Miguel de Cervantes", 1500, 5);
        libro1.venderLibros(1);
        libro1.incremetarCopiasLibro(2);
        String mostrarLibro1= libro1.mostrarLibros(libro1.getIdLibro(), libro1.getTitulo(), libro1.getAutor(), libro1.getPrecio(), libro1.getCantidadDisponibles());
        System.out.println(mostrarLibro1);

        Biblioteca libro2 = new Biblioteca();
        libro2.asignarLibro("Cuentos de Canterbury", "Geoffrey Chaucer", 2500, 3);
        libro2.venderLibros(4);
        libro2.incremetarCopiasLibro(2);
        String mostrarLibro2 = libro2.mostrarLibros(libro2.getIdLibro(), libro2.getTitulo(), libro2.getAutor(), libro2.getPrecio(), libro2.getCantidadDisponibles());
        System.out.println(mostrarLibro2);
        */

        /*  PUNTO NUMERO 4
        ItemVenta venta1= new ItemVenta();
        System.out.println("Ingrese que desa ingresar al carrito:");
        String des = teclado.nextLine();
        System.out.println("Ingrese la cantidad:");
        int cant= teclado.nextInt();
        System.out.println("Ingrese el precio por unidad");
        double pUnitario= teclado.nextDouble();
        venta1.generarVenta(des, cant,pUnitario);
        int precioTotal = venta1.calcularPrecioTotal();
        String ventaFinal= venta1.representacionCadena(venta1.getIdVenta(), venta1.getDescripcion(), venta1.getCantidad(), venta1.getPrecioUnitario(), precioTotal);
        System.out.println(ventaFinal);
        */

        Biblioteca biblioteca= new Biblioteca();

        Libro l = biblioteca.agregarLibro( "Don quijote", "aa", 12,12 );

            biblioteca.agregarLibro("aaaaaa", "bb", 13,13);
        biblioteca.mostrarLibros();


    }
}