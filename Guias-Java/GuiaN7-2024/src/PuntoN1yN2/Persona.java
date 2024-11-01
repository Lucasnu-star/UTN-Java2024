package PuntoN1yN2;

import org.json.JSONObject;

import java.util.Objects;

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
    private String sexo;

    //Consutructor
    public Persona(String nombre, int edad, String dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && sexo == persona.sexo && Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, dni, sexo);
    }

    //Metodos
    public JSONObject toJsonObject() {
        JSONObject JSON = new JSONObject();
        JSON.put("nombre" , this.nombre);
        JSON.put("edad", this.edad);
        JSON.put("dni" , this.dni);
        JSON.put("sexo", this.sexo);

        return JSON;
    }

    public static Persona fromJsonObject(JSONObject jsonObject) {
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        String dni = jsonObject.getString("dni");
        String sexo = jsonObject.getString("sexo"); // Convertimos el string a char
        return new Persona(nombre, edad, dni, sexo);
    }



    //ToString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
