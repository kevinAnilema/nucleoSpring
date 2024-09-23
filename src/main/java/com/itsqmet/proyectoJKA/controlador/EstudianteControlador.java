package com.itsqmet.proyectoJKA.controlador;


import com.itsqmet.proyectoJKA.modelo.Estudiante;
import com.itsqmet.proyectoJKA.servicio.impl.EstudianteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteServicioImpl estudianteServicio;

    @GetMapping("/estudiantes")
    public String paginaEstudiantes(Model model) {
        model.addAttribute("estudiantes",estudianteServicio.listarEstudiantes());
        return "/Estudiante/listarEstudiantes";
    }

    @GetMapping("/agregarEstudiante")
    public String agregarEstudiante(Estudiante estudiante) {
        return "/Estudiante/nuevoEstudiante";
    }
    @PostMapping("/estudiante/guardar")
    public String guardarEstudiante(Estudiante estudiante) {
        estudianteServicio.crearEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/editarEstudiante/{idEstudiante}")
    public String editarEstudiante(Estudiante estudiante, Model model) {
        estudiante=estudianteServicio.buscarEstudiante(estudiante.getIdEstudiante());
        model.addAttribute("estudiante",estudiante);
        return "/Estudiante/nuevoEstudiante";
    }

    @GetMapping("/eliminarEstudiante/{idEstudiante}")
    public String eliminarEstudiante(Estudiante estudiante) {
        estudianteServicio.eliminarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }


}
