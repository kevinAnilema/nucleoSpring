package com.itsqmet.proyectoJKA.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatriculaControlador {
    @GetMapping("/matriculas")
    public String paginaMatriculas() {
        return "/Matricula/listarMatriculas";
    }
}
