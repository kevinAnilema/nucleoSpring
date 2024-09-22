package com.itsqmet.proyectoJKA.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int idmatricula;
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
}
