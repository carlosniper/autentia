package com.carlosgarcia.autentia.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.service.CursoService;
import com.carlosgarcia.autentia.util.AutentiaConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class CursoControllerTest.
 */
@ExtendWith(MockitoExtension.class)
public class CursoControllerTest implements AutentiaConstants {
	
	/** The curso service. */
	@Mock
	private CursoService cursoService;
	
	/** The curso controller. */
	@InjectMocks
	private CursoController cursoController;
	
	/**
	 * Gets the cursos ok.
	 *
	 * @return the cursos ok
	 */
	@Test
	public void getCursosOk() {
		
		Mockito.when(this.cursoService.getAllCursos()).thenReturn(Optional.of(LISTA_CURSO));
		
		ResponseEntity<List<Curso>> response = this.cursoController.getCursos();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}
	
	/**
	 * Gets the cursos empty.
	 *
	 * @return the cursos empty
	 */
	@Test
	public void getCursosEmpty() {
		
		Mockito.when(this.cursoService.getAllCursos()).thenReturn(Optional.empty());
		
		ResponseEntity<List<Curso>> response = this.cursoController.getCursos();
		
		assertEquals(response.getStatusCode(), HttpStatus.NO_CONTENT);
	}
	
	/**
	 * Insert curso.
	 */
	@Test
	public void insertCurso() {
		
		Mockito.when(this.cursoService.createCurso(CURSO)).thenReturn(Optional.of(CURSO));
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(CURSO);
		
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		assertEquals(response.getBody().getId(), CURSO.getId());
	}
	
	/**
	 * Insert curso ok.
	 */
	@Test
	public void insertCursoOk() {
		
		Mockito.when(this.cursoService.createCurso(CURSO)).thenReturn(Optional.of(CURSO));
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(CURSO);
		
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		assertEquals(response.getBody().getId(), CURSO.getId());
	}
	
	/**
	 * Insert curso null.
	 */
	@Test
	public void insertCursoNull() {
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(null);
		
		assertEquals(response.getStatusCode(), HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Insert curso empty.
	 */
	@Test
	public void insertCursoEmpty() {
		
		Mockito.when(this.cursoService.createCurso(CURSO)).thenReturn(Optional.empty());
		
		ResponseEntity<Curso> response = this.cursoController.insertCurso(CURSO);
		
		assertEquals(response.getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
