package com.itsqmet.proyectoJKA.servicio;

import com.itsqmet.proyectoJKA.modelo.Profesor;

public interface IProfesorServicio {
    public void crearProfesor(Profesor profesor);
    public void actualizarProfesor(Profesor profesor);
    public void eliminarProfesor(Profesor profesor);
}
