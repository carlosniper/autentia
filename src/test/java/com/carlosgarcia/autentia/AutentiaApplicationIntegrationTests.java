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

@SpringBootTest
class AutentiaApplicationIntegrationTests {
	
	@Autowired
	private CursoController cursoController;
	
	@Autowired
	private ProfesorController profesorController;
	
	@Test
	public void getAllProfesoresOk() {
		
		ResponseEntity<List<Profesor>> response = this.profesorController.getProfesores();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}

	@Test
	public void getAllCursosOk() {
		
		ResponseEntity<List<Curso>> response = this.cursoController.getCursos();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}
	
	@Test
	public void insertCursoOk() {
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(AutentiaConstants.CURSO);
		
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		assertEquals(response.getBody().getTitulo(), AutentiaConstants.CURSO.getTitulo());
	}
}
