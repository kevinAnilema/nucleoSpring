package com.itsqmet.proyectoJKA.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {
    @GetMapping("/")
    public String paginaInicio() {
        return "/index";
    }
}
