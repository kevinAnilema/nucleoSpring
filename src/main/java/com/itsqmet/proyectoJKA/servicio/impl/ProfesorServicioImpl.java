package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.repositorio.IProfesorRepositorio;
import com.itsqmet.proyectoJKA.servicio.IProfesorServicio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {
    @AutoConfigureOrder
    @Autowired
    private IProfesorRepositorio profesorRepositorio;

    @Override
    public void crearProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);
    }

    @Override
    public void eliminarProfesor(int id) {
        Optional<Profesor> profesorOptional = profesorRepositorio.findById(id);
        if (profesorOptional.isPresent()) {
            profesorRepositorio.delete(profesorOptional.get());
        } else {
            throw new IllegalArgumentException("Profesor no encontrado con id: " + id);
        }
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
    public Profesor buscarProfesor(int id) {
        Optional<Profesor> profesorOptional = profesorRepositorio.findById(id);
        if (profesorOptional.isPresent()) {
            Profesor profesor = profesorOptional.get();
            System.out.println("Profesor encontrado: " + profesor);
            return profesor;
        } else {
            throw new IllegalArgumentException("Profesor no encontrado con id: " + id);
        }
    }

}
