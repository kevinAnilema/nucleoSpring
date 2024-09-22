package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Matricula;

public interface IMatriculaServicio {
    public void crearMatricula(Matricula matricula);
    public void actualizarMatricula(Matricula matricula);
    public void eliminarMatricula(Matricula matricula);
}
