package PuntoN1yN2;

import org.json.JSONObject;

/**
 * 1- Crea una clase Persona con los siguientes atributos: nombre, edad, dni, y
 * sexo. Implementa un constructor, getters y setters para los atributos.
 * Ahora, implementa un método que convierta un objeto Persona a una
 * representación JSON y luego guarda la representación JSON en un archivo
 * llamado persona.json. Elige y utiliza una biblioteca de tu elección para la
 * serialización de objetos a JSON y la escritura en archivos.
 * Objetivos:
 * - Convertir un objeto Java a JSON.
 * - Escribir datos JSON en un archivo
 *
 * 2. Utiliza la clase Persona del ejercicio anterior. Lee el archivo persona.json que
 * creaste y convierte el JSON leído de nuevo a un objeto Persona.
 * Objetivos:
 * - Leer datos JSON desde un archivo.
 * - Convertir JSON a un objeto Java.
 */
public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;

    //Consutructor
    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    //ToString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    //Metodos
    public JSONObject toJsonObject()
    {
        JSONObject JSON = new JSONObject();
        JSON.put("nombre" , this.nombre);
        JSON.put("edad", this.edad);
        JSON.put("dni" , this.dni);
        JSON.put("sexo", this.sexo);

        return JSON;
    }






}
