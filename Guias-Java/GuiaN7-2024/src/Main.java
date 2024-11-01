

import PuntoN1yN2.ListaPersonas;
import PuntoN1yN2.Persona;
import PuntoN3.Curso;
import PuntoN3.Cursos;
import org.json.JSONArray;
import org.json.JSONTokener;
import org.w3c.dom.css.CSSRule;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        //PUNTO NUMERO 1 Y 2
        /*
        String nombreArchivo= "personas.json";
        Persona p1= new Persona("Lucas", 21, "44692711" , "m");
        Persona p2= new Persona("Valentina" , 21, "44459809", "f");

        p1.toJsonObject();
        p2.toJsonObject();


        JSONArray jsonArrayPersonas= new JSONArray();
        jsonArrayPersonas.put(p1);
        jsonArrayPersonas.put(p2);

        ListaPersonas listaPersonaConDown= new ListaPersonas();
        listaPersonaConDown.agregarPersonas(p1);
        listaPersonaConDown.agregarPersonas(p2);

        Archivos.agregarObjectiArchivo(nombreArchivo, listaPersonaConDown.getListaPersonas());
        ArrayList<Persona> listaPersonasLeidasDelArchivo =  Archivos.leerArchivoPersonas(nombreArchivo);


        System.out.println(listaPersonasLeidasDelArchivo.toString());

         */

        //Punto 3

        Persona p1= new Persona("Lucas", 21, "44692711" , "m");
        Persona p2= new Persona("Valentina" , 21, "44459809", "f");

        p1.toJsonObject();
        p2.toJsonObject();


        JSONArray jsonArrayPersonas= new JSONArray();
        jsonArrayPersonas.put(p1);
        jsonArrayPersonas.put(p2);

        ListaPersonas listaPersonaConDown= new ListaPersonas();
        listaPersonaConDown.agregarPersonas(p1);
        listaPersonaConDown.agregarPersonas(p2);

        Curso curso1 = new Curso("Ingles" , 223);
        curso1.ingresarAlumno(p1);
        curso1.ingresarAlumno(p2);

        Curso curso2 = new Curso("Matematica" , 111);
        curso2.ingresarAlumno(p1);
        Cursos cursosGenerales= new Cursos();

        cursosGenerales.agregarCursos(curso1);
        cursosGenerales.agregarCursos(curso2);

        Archivos.agregarObjectiArchivoCurso("curso.json", cursosGenerales.getCursos());









        }
    }
