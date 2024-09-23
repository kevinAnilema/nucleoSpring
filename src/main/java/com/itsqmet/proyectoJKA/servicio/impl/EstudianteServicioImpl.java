package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Estudiante;
import com.itsqmet.proyectoJKA.repositorio.IEstudianteRepositorio;
import com.itsqmet.proyectoJKA.servicio.IEstudianteServicio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EstudianteServicioImpl implements IEstudianteServicio {
    @Autowired
    private IEstudianteRepositorio estudianteRepositorio;

    @Override
    public void crearEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }
    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }
    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.deleteById(estudiante.getIdEstudiante());
    }
    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }
    @Transactional
    public Estudiante buscarEstudiante(int id) {
        return estudianteRepositorio.findById(id).get();
    }
}
