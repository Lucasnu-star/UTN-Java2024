package PuntoN3;

import java.util.ArrayList;

public class Cursos {

    ArrayList<Curso> cursos;

    public Cursos() {
        this.cursos = new ArrayList<>();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCursos(Curso curso)
     {
         cursos.add(curso);
     }

}
