package com.itsqmet.proyectoJKA;

import com.itsqmet.proyectoJKA.modelo.Profesor;
import com.itsqmet.proyectoJKA.servicio.IProfesorServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProyectoJkaApplicationTests {

	@Autowired
	private IProfesorServicio profesorServicio;

	@Test
	void contextLoads() {
		Profesor profesor = new Profesor();
		profesor.setNombreProfesor("Kevin Anilema 3");
		profesor.setDireccionProfesor("Quito 3");
		profesorServicio.crearProfesor(profesor);

		List<Profesor>resultado=profesorServicio.listarProfesores();
		for (Profesor profe:resultado){
			System.out.println(profe.getNombreProfesor());
		}
	}
	//@Test
	//void contextLoads2() {
	//	profesorServicio.eliminarProfesor(3);
	//}
	@Test
	void contextLoads3() {
		Profesor profesor = new Profesor();
		//profesor.setIdProfesor(8);
		profesor.setNombreProfesor("Kevin Anilema - test");
		profesor.setDireccionProfesor("Quito test");
		//profesorServicio.actualizarProfesor(profesor);
	}
	@Test
	void contextLoads4() {
		profesorServicio.buscarProfesorPorID(1);
	}
}
