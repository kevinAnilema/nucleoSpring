package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Profesor;

import java.util.List;

public interface IProfesorServicio {
    public void crearProfesor(Profesor profesor);
    public void actualizarProfesor(Profesor profesor);
    public void eliminarProfesor(Profesor profesor);
    public List<Profesor> listarProfesores();
    public Profesor buscarProfesorPorID(int id);
}
