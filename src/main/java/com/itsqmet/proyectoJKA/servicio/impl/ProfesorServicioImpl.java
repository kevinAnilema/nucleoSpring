package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.repositorio.IProfesorRepositorio;
import com.itsqmet.proyectoJKA.servicio.IProfesorServicio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {

    @Autowired
    private IProfesorRepositorio profesorRepositorio;

    @Override
    public void crearProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);
    }

    @Override
    public void eliminarProfesor(Profesor profesor) {
        profesorRepositorio.deleteById(profesor.getIdProfesor());
    }

    @Override
    public void actualizarProfesor(Profesor profesor) {
        if (profesor == null || profesor.getIdProfesor() <= 0) {
            throw new IllegalArgumentException("El profesor no puede ser nulo y debe tener un ID válido");
        }
        profesorRepositorio.save(profesor);
    }
    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepositorio.findAll();
    }

    @Transactional
    public Profesor buscarProfesorPorID(int id) {
        return profesorRepositorio.findById(id).get();
    }

}
