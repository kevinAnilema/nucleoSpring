package com.itsqmet.proyectoJKA.repositorio;

import com.itsqmet.proyectoJKA.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
