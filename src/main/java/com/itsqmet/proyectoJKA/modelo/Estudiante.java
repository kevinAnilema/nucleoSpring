package com.itsqmet.proyectoJKA.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;

    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String correoEstudiante;
    private String telefonoEstudiante;

    @ManyToMany
    @JoinTable(
            name = "estudiante_curso",
            joinColumns = @JoinColumn(name="idEstudiante"),
            inverseJoinColumns = @JoinColumn(name = "idCurso"))
    private List<Curso> cursos;


}
