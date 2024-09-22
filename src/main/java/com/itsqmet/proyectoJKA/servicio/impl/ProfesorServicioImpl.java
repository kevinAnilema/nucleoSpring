package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.repositorio.IProfesorRepositorio;
import com.itsqmet.proyectoJKA.servicio.IProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {

    @Autowired
    public IProfesorRepositorio profesorRepositorio;

    @Override
    public void crearProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);
    }

    @Override
    public void eliminarProfesor(Profesor profesor) {
        profesorRepositorio.delete(profesor);
    }

    @Override
    public void actualizarProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);
    }

}
