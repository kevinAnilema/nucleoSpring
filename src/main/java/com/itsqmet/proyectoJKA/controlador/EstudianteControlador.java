package com.itsqmet.proyectoJKA.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControlador {
    @GetMapping("/estudiantes")
    public String paginaEstudiantes() {
        return "/Estudiante/listarEstudiantes";
    }
}
