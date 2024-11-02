package Archivo;

import Clases.Ave;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Archivo {

    public static void crearArchivo(String nombreArchivo, HashSet<Ave> listaAve)
    {
        JSONArray jsonArray = new JSONArray();

        for(Ave ave: listaAve)
        {
            jsonArray.put(ave.toJsonObject());  //Convierte todos las aves de la lista a jsonObject
        }

        try(FileWriter file = new FileWriter(nombreArchivo))
        {
            file.write(jsonArray.toString());
            System.out.println("Archivo creado con éxito: " + nombreArchivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashSet<Ave> listaAve (String nombreArchivo)
    {
        HashSet<Ave> listaAve= new HashSet<>();

        try(FileReader read = new FileReader(nombreArchivo)) {
            JSONTokener jsonTokener = new JSONTokener(read);
            JSONArray jsonArray = new JSONArray(jsonTokener);

            for(int i=0; i< jsonArray.length(); i++)
            {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                Ave ave= Ave.fromJsonObject(jsonObj);
                listaAve.add(ave);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException("El archivo no se encontró: " + nombreArchivo, e);
        } catch (IOException e) {
            throw new RuntimeException("Error de entrada/salida al leer el archivo: " + nombreArchivo, e);
        }

        return listaAve;
    }
}
