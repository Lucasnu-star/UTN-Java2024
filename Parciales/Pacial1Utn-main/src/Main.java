import Clases.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        Persona payaso1= new Payaso("Jose", "333" , 3);
        Persona payaso2 = new Payaso("Manuel" , "444", 7 );
        Persona equilibrista1 = new Equilibrista("Marcos" , "555" , 15);
        Persona adiestrador1 = new Adiestrador("Lucas" , "666" , 6);
        Persona personalMant1= new PersonalMantenimiento("Pablo" , "888");
        PerroAdiestrado perritoAdiestrado1= new PerroAdiestrado(3);
        PerroAdiestrado perritoAdiestrado2= new PerroAdiestrado(4);
        PerroAdiestrado perritoAdiestrado3 = new PerroAdiestrado(3);

        System.out.println("Personal Mantenimiento");
        personalMant((PersonalMantenimiento) personalMant1);

        Circo circo1= new Circo();
        circo1.agregarListaCirco(payaso1);
        circo1.agregarListaCirco(payaso2);
        circo1.agregarListaCirco(equilibrista1);
        circo1.agregarListaCirco(adiestrador1);
        circo1.agregarListaCirco(personalMant1);
        System.out.println("Lista personas del circo!"); // Aca muestra los payasos, equilibrista, adiestrador y personal mantenimiento
        circo1.mostrarListaPersonasCirco();
        circo1.agregarPerroAdiestrado(perritoAdiestrado1);
        circo1.agregarPerroAdiestrado(perritoAdiestrado2);
        circo1.agregarPerroAdiestrado(perritoAdiestrado3);
        System.out.println("Lista perros adiestrados del circo!"); // Aca muestra todos los perros adiestrados del circo
        circo1.mostrarListaPerrosAdiestrados();

        System.out.println("Cantidad rutinas de los payasos");
        System.out.println(circo1.sumarRutinasPayaso());

        ShowTime show1= new ShowTime();
        show1.agregarAlShow(circo1.getListaCirco(), circo1.getListaPerrosAdiestrados()  );
        System.out.println("Lista que brinda el show!"); // Aca aparecen todos los que brindan el show
        show1.mostrarListaShow();




    }

    public static void personalMant(PersonalMantenimiento personalMat)
        {

            System.out.println( personalMat.desarmarCarpa());
            System.out.println(personalMat.armarCarpa());

        }




}