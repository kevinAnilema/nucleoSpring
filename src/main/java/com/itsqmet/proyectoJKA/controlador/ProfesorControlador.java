package com.itsqmet.proyectoJKA.controlador;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.servicio.impl.ProfesorServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfesorControlador {
    @Autowired
    private ProfesorServicioImpl profesorServicio;

    @GetMapping("/profesores")
    public String paginaProfesores(Model model) {
        model.addAttribute("profesores", profesorServicio.listarProfesores());
        return "/Profesor/listarProfesores";
    }
    @GetMapping("/agregarProfesor")
    public String agregarProfesor(Profesor profesor) {
        return "/Profesor/nuevoProfesor";
    }

    @PostMapping("/profesor/guardar")
    public String guardarProfesor(Profesor profesor) {
        profesorServicio.crearProfesor(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("editarProfesor/{idProfesor}")
    public String editarProfesor(Profesor profesor, Model model) {
        profesor=profesorServicio.buscarProfesorPorID(profesor.getIdProfesor());
        model.addAttribute("profesor", profesor);
        return "/Profesor/nuevoProfesor";
    }
    @GetMapping("/eliminarProfesor/{idProfesor}")
    public String eliminarProfesor(Profesor profesor) {
        profesorServicio.eliminarProfesor(profesor);
        return "redirect:/profesores";
    }
}
