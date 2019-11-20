package com.carlosgarcia.autentia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.carlosgarcia.autentia.controller.CursoController;
import com.carlosgarcia.autentia.controller.ProfesorController;
import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.util.AutentiaConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class AutentiaApplicationIntegrationTests.
 */
@SpringBootTest
class AutentiaApplicationIntegrationTests {
	
	/** The curso controller. */
	@Autowired
	private CursoController cursoController;
	
	/** The profesor controller. */
	@Autowired
	private ProfesorController profesorController;
	
	/**
	 * Gets the all profesores ok.
	 *
	 * @return the all profesores ok
	 */
	@Test
	public void getAllProfesoresOk() {
		
		ResponseEntity<List<Profesor>> response = this.profesorController.getProfesores();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}

	/**
	 * Gets the all cursos ok.
	 *
	 * @return the all cursos ok
	 */
	@Test
	public void getAllCursosOk() {
		
		ResponseEntity<List<Curso>> response = this.cursoController.getCursos();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}
	
	/**
	 * Insert curso ok.
	 */
	@Test
	public void insertCursoOk() {
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(AutentiaConstants.CURSO);
		
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		assertEquals(response.getBody().getTitulo(), AutentiaConstants.CURSO.getTitulo());
	}
}
