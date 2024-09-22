package com.itsqmet.proyectoJKA.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoControlador {
    @GetMapping("/cursos")
    public String paginaCursos(){
        return "Curso/listarCursos";
    }
}
