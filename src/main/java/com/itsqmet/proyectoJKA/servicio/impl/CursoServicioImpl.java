package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Curso;
import com.itsqmet.proyectoJKA.repositorio.ICursoRepositorio;
import com.itsqmet.proyectoJKA.servicio.ICursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio {
    @Autowired
    private ICursoRepositorio cursoRepositorio;
    @Override
    public void crearCurso(Curso curso) {
        cursoRepositorio.save(curso);
    }
    @Override
    public void actualizarCurso(Curso curso) {
        cursoRepositorio.save(curso);
    }
    @Override
    public void eliminarCurso(Curso curso) {
        cursoRepositorio.delete(curso);
    }
}
