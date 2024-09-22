package com.itsqmet.proyectoJKA;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.servicio.IProfesorServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectoJkaApplicationTests {

	@Autowired
	private IProfesorServicio profesorServicio;

	@Test
	void contextLoads() {
		Profesor profesor = new Profesor();
		profesor.setNombreProfesor("Kevin Anilema");
		profesor.setDireccionProfesor("Quito");
		profesorServicio.crearProfesor(profesor);
	}

}
