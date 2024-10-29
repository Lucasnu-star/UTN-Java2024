import PuntoN1yN2.Persona;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.util.Objects;

public class Archivos {

    public static void crearEscribirArchivo(String nombreArchivo, JSONArray json)
    {
        try (FileWriter file = new FileWriter(nombreArchivo)){
            file.write(json.toString());
            System.out.println("Creado exitosamente");
            file.close();
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    public static JSONTokener leerArchivo(String archivo)
    {

            JSONTokener jsonTokener= null;

            try
            {
                jsonTokener= new JSONTokener(new FileReader(archivo));
            } catch (FileNotFoundException e) {
                System.out.println("No se lee el archivo" + archivo);
                e.printStackTrace();
            }


        return jsonTokener;
    }

    public static void archivoToObject(String nombreArchivo)
    {
        //Crear un jsonObject a partir de la funcion que retorna el tokener.
        JSONObject jsonObjct= new JSONObject(leerArchivo(nombreArchivo));

        //Crear un jsonArray a partir del jsonObject
        JSONArray jsonArray = jsonObjct.getJSONArray("personas");

        //Recorrer el jsonArray con un for
        for(int i=0; i< jsonArray.length(); i++)
        {
            JSONObject personas = new JSONObject(i);
            String nombre= personas.getString("nombre");
            int edad= personas.getInt("edad");
            String dni = personas.getString("dni");
            char sexo = personas.getString("sexo").charAt(0);

            Persona persona = new Persona(nombre, edad,dni,sexo);
            System.out.println(persona.toString());
        }


    }
}
