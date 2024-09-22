package com.itsqmet.proyectoJKA.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulaControlador {
    @GetMapping("/aulas")
    public String paginaListaAula() {
        return "/Aula/listarAulas";
    }
}
