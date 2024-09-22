package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Curso;

public interface ICursoServicio {
    public void crearCurso(Curso curso);
    public void actualizarCurso(Curso curso);
    public void eliminarCurso(Curso curso);
}
