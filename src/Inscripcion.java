/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Inscripcion {
    
    private Alumno alumno;
    private Curso curso;
    private float nota;
    
    public Inscripcion(){}

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
