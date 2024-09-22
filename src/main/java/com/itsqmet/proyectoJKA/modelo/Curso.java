package com.itsqmet.proyectoJKA.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String cursoNombre;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;

    @ManyToMany
    @JoinTable(
            name = "estudiante_curso",
            joinColumns = @JoinColumn(name="idCurso"),
            inverseJoinColumns = @JoinColumn(name = "idEstudiante"))
    private List<Estudiante> estudiantes;

    @ManyToOne
    @JoinColumn(name = "idAula")
    private Aula aula;
}
