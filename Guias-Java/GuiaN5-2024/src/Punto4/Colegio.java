package Punto4;


/**
 * Crea una clase colegio que almacene el listado de los alumnos (compuestos
 * por su nombre y nacionalidad). La clase tendrá los siguientes
 * métodos:
 * - agregarAlumno(Alumno alumno): añade el alumno recibido por
 * parámetro al listado.
 * - verNacionalidad(String nacionalidad): Muestra la nacionalidad y el
 * número de alumnos de esa nacionalidad
 * - cuantos(): Muestra cuántas nacionalidades diferentes existen en el
 * colegio.
 * - borrar(Alumno alumno): Elimina a un alumno específico del listado.
 * - verTodos(): Muestra las distintas nacionalidades y el número de
 * alumnos que existen por nacionalidad.
 * Para todos estos métodos se deben generar distintas validaciones para
 * prevenir errores en la ejecución. Por ej: Que todos los alumnos tengan una
 * nacionalidad, que exista el alumno que se quiere borrar, etc.
 */

import Punto4.Exepciones.ExcepcionAlumnoNoEncontrado;
import Punto4.Exepciones.ExcepcionNoTieneNacionalidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Colegio{



    private ArrayList<Estudiante> arrayEst;
    private HashSet<String> arrayNacionalidades;

    //Constructor
    public Colegio() {
        arrayEst= new ArrayList<>();
        arrayNacionalidades= new HashSet<>();
    }

    //getter
    public ArrayList<Estudiante> getArrayEst() {
        return arrayEst;
    }

    //Metodos
    public void agregarAlumno(Estudiante est){
        arrayEst.add(est);
    }

    public void eliminarAlumno(Estudiante estudiantesBorrar) throws ExcepcionAlumnoNoEncontrado {
        boolean alumnoEliminado = false;

        // Usar un iterador para evitar ConcurrentModificationException
        Iterator<Estudiante> iterador = arrayEst.iterator();

        while (iterador.hasNext()) {
            Estudiante estudianteRecorrido = iterador.next();

            if (estudiantesBorrar.equals(estudianteRecorrido)) {
                iterador.remove(); // Eliminar el estudiante de forma segura
                alumnoEliminado = true;
                break; // Salir del bucle una vez eliminado
            }
        }

        // Si no se encontró el estudiante a eliminar, lanzamos una excepción
        if (!alumnoEliminado) {
            throw new ExcepcionAlumnoNoEncontrado("El alumno no fue encontrado en la lista.");
        }
    }

    public void contarNacionalidades()
    {
        for(Estudiante estudianteRecorrer: arrayEst)
        {
            arrayNacionalidades.add(estudianteRecorrer.getNacionalidad());
        }
    }

    public void verNacionalidades()
    {
        System.out.println(arrayNacionalidades);
    }

    public String buscarNacionalidad(String nacionalidad) throws ExcepcionNoTieneNacionalidad
    {
          int contador=0;

             for(Estudiante estNacionalidadRecorrida : arrayEst)
             {
                if(estNacionalidadRecorrida.getNacionalidad().equals(nacionalidad))
                    {
                        contador++;
                    }
             }

             if(contador==0)
             {
                 throw  new ExcepcionNoTieneNacionalidad("No se encuentra esa nacionalidad");
             }

            return "Se encontraron " + contador + " de la nacionalidad:  " + nacionalidad;
    }
}
