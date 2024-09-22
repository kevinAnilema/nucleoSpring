package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Matricula;
import com.itsqmet.proyectoJKA.repositorio.IMatriculaRepositorio;
import com.itsqmet.proyectoJKA.servicio.IMatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MatriculaServicioImpl implements IMatriculaServicio {

    @Autowired
    private IMatriculaRepositorio matriculaRepositorio;
    @Override
    public void crearMatricula(Matricula matricula) {
        matriculaRepositorio.save(matricula);
    }
    @Override
    public  void actualizarMatricula(Matricula matricula) {
        matriculaRepositorio.save(matricula);
    }
    @Override
    public void eliminarMatricula(Matricula matricula) {
        matriculaRepositorio.delete(matricula);
    }
}
