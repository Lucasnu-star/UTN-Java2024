import PuntoN1yN2.ListaPersonas;
import PuntoN1yN2.Persona;
import PuntoN3.Curso;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

    public static void agregarObjectiArchivo(String nombreArchivo , ArrayList<Curso> arrayPersonas)
        {
           JSONArray arrayJSON= new JSONArray();
           for(Curso persona : arrayPersonas)
           {
               arrayJSON.put(persona.toJsonObject()); // Mandamos todo al arrayJSON a las personas como objects.
           }

            try(FileWriter file = new FileWriter(nombreArchivo))
            {
                file.write(arrayJSON.toString());
                System.out.println("Archivo creado");
            }catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }

    public static void agregarObjectiArchivoCurso(String nombreArchivo, ArrayList<Curso> arrayCursos) {
        JSONArray arrayJSON = new JSONArray(); // Crear un JSONArray para almacenar los cursos

        for (Curso curso : arrayCursos) {
            arrayJSON.put(curso.toJsonObject()); // Convertir cada curso a JSONObject y agregarlo al array
        }

        try (FileWriter file = new FileWriter(nombreArchivo)) {
            file.write(arrayJSON.toString()); // Escribir el array JSON en el archivo
            System.out.println("Archivo creado con éxito: " + nombreArchivo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

        public static ArrayList<Persona> leerArchivoPersonas(String nombreArchivo)
        {
            ArrayList<Persona> arrayPersonas= new ArrayList<>();

            try (FileReader read = new FileReader(nombreArchivo)){
                JSONTokener jsonTokener = new JSONTokener(read);
                JSONArray jsonArray = new JSONArray(jsonTokener);

                for(int i =0; i< jsonArray.length() ; i++)
                {
                    JSONObject personaObj = jsonArray.getJSONObject(i);
                    Persona persona= Persona.fromJsonObject(personaObj);
                    arrayPersonas.add(persona);

                }
            } catch (FileNotFoundException e) {
            throw new RuntimeException("El archivo no se encontró: " + nombreArchivo, e);
        } catch (IOException e) {
            throw new RuntimeException("Error de entrada/salida al leer el archivo: " + nombreArchivo, e);
        }

            return arrayPersonas;
        }


    public static ArrayList<Curso> leerArchivoCursos(String nombreArchivo)
    {
        ArrayList<Curso> arrayCursos= new ArrayList<>();

        try (FileReader read = new FileReader(nombreArchivo)){
            JSONTokener jsonTokener = new JSONTokener(read);
            JSONArray jsonArray = new JSONArray(jsonTokener);

            for(int i =0; i< jsonArray.length() ; i++)
            {
                JSONObject cursoObj = jsonArray.getJSONObject(i);
                Curso curso = Curso.fromJsonObject(cursoObj);
                arrayCursos.add(curso);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("El archivo no se encontró: " + nombreArchivo, e);
        } catch (IOException e) {
            throw new RuntimeException("Error de entrada/salida al leer el archivo: " + nombreArchivo, e);
        }

        return arrayCursos;
    }
}
