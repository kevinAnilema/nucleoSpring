package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {
    public void crearEstudiante(Estudiante estudiante);
    public void actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);
    public List<Estudiante> listarEstudiantes();
    public Estudiante buscarEstudiante(int id);
}
