package com.itsqmet.proyectoJKA.servicio.impl;

import com.itsqmet.proyectoJKA.modelo.Aula;
import com.itsqmet.proyectoJKA.repositorio.IAulaRepositorio;
import com.itsqmet.proyectoJKA.servicio.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AulaServicioImpl implements IAulaServicio {
    @Autowired
    public IAulaRepositorio aulaRepositorio;
    @Override
    public void crearAula(Aula aula) {
        aulaRepositorio.save(aula);
    }
    @Override
    public void eliminarAula(Aula aula) {
        aulaRepositorio.delete(aula);
    }
    @Override
    public void actualizarAula(Aula aula) {
        aulaRepositorio.save(aula);
    }
}
