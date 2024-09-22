package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Profesor;

import java.util.List;

public interface IProfesorServicio {
    public void crearProfesor(Profesor profesor);
    public void actualizarProfesor(Profesor profesor);
    public void eliminarProfesor(int id);
    public List<Profesor> listarProfesores();
    public Profesor buscarProfesor(int id);
}
