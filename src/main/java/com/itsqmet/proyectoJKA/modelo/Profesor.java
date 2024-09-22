package com.itsqmet.proyectoJKA.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
//@Table(name = "Profesor")
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;

    @Column(name = "nombreProfesor",length = 50)
    private String nombreProfesor;
    private String direccionProfesor;

    @OneToMany(mappedBy = "profesor",cascade = CascadeType.ALL)
    private List<Curso> cursos;


}

