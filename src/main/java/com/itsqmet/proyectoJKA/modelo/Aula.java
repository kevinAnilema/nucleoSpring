package com.itsqmet.proyectoJKA.modelo;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int idAula;
    private String nombre;

    @OneToMany(mappedBy = "aula",cascade = CascadeType.ALL)
    private List<Curso> cursos;
}
