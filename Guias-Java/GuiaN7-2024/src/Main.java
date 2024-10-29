

import PuntoN1yN2.Persona;
import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona("Lucas", 21, "44692711" , 'm');
        Persona p2= new Persona("Valentina" , 21, "5543321", 'f');

        p1.toJsonObject();
        p2.toJsonObject();


        JSONArray jsonArrayPersonas= new JSONArray();
        jsonArrayPersonas.put(p1);
        jsonArrayPersonas.put(p2);



        Archivos.crearEscribirArchivo("personas.json",jsonArrayPersonas );
        System.out.println(new File("personas.json").getAbsolutePath());

        JSONTokener tokener =  Archivos.leerArchivo("personas.json");

        System.out.println(tokener.toString());

        Archivos.archivoToObject("personas.json");



        }
    }
