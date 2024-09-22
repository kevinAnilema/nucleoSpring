package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Estudiante;

public interface IEstudianteServicio {
    public void crearEstudiante(Estudiante estudiante);
    public void actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);
}
