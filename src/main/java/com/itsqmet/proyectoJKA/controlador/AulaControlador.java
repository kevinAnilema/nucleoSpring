package com.itsqmet.proyectoJKA.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AulaControlador {

    @GetMapping("/aulas")
    public String paginaListaAula() {
        return "/Aula/listarAulas";
    }
    @GetMapping("/aulas/crear")
    public String paginaCrearAula() {
        return "/Aula/nuevaAula"; // Vista para crear o editar una aula
    }
}
