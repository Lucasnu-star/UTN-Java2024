package PuntoN3;

import PuntoN1yN2.Persona;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Crea una clase Curso con atributos como nombreCurso, código, y una lista
 * de Personas inscritas en el curso. Implementa métodos para agregar y
 * eliminar personas del curso.
 * Luego crea un método que convierta un objeto Curso a JSON y guárdalo en
 * un archivo curso.json.
 * Implementa otro método que lea el archivo curso.json y convierta el JSON a
 * un objeto Curso.
 * Objetivos:
 * - Trabajar con listas de objetos y su persistencia en JSON.
 * - Leer y escribir JSON que contenga una estructura compleja
 */

public class Curso {


        //Atributos
        private String nombreCurso;
        private int codigoCurso;
        private ArrayList<Persona> listaPersonasInscritas;

        //Constructor
        public Curso(String nombreCurso, int codigoCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.listaPersonasInscritas= new ArrayList<>();}

        //Getters && Setters
        public String getNombreCurso() {
        return nombreCurso;
    }
        public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
        public int getCodigoCurso() {
        return codigoCurso;
    }
        public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
        public ArrayList<Persona> getListaPersonasInscritas() {
        return listaPersonasInscritas;
    }
        public void setListaPersonasInscritas(ArrayList<Persona> listaPersonasInscritas) {
        this.listaPersonasInscritas = listaPersonasInscritas;
    }

        //ToString
        @Override
        public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", listaPersonasInscritas=" + listaPersonasInscritas +
                '}';
    }

        //Metodos
        public void ingresarAlumno (Persona persona)
        {
            listaPersonasInscritas.add(persona);
        }
        public void sacarAlumno (Persona persona)
        {
            listaPersonasInscritas.remove(persona);
        }

        public JSONObject toJsonObject()
        {
            JSONObject json= new JSONObject();
            json.put("NombreCurso" , this.nombreCurso);
            json.put("CodigoCurso" , this.codigoCurso);

            JSONArray listaPersonasCurso= new JSONArray();
            for(Persona persona :this.listaPersonasInscritas)
            {
                listaPersonasCurso.put(persona.toJsonObject());
            }

            json.put("ListaPersonasCursos" , listaPersonasCurso);

            return json;
        }

        public static Curso fromJsonObject(JSONObject jsonObj)
        {
            String nombreCurso= jsonObj.getString("NombreCurso");
            int codigo= jsonObj.getInt("CodigoCurso");
            JSONArray jsonArray = jsonObj.getJSONArray("ListaPersonasCursos");
            ArrayList <Persona > arrayPersonas = new ArrayList<>();

            for(int i=0; i<jsonArray.length(); i++)
            {
                JSONObject personasObj = jsonArray.getJSONObject(i);
                Persona persona = Persona.fromJsonObject(personasObj);

                arrayPersonas.add(persona);
            }

            Curso curso = new Curso(nombreCurso, codigo);

            for (Persona persona : arrayPersonas) {
                curso.ingresarAlumno(persona);
            }

            return curso;

        }



}
