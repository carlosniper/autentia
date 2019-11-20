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

import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.service.ProfesorService;
import com.carlosgarcia.autentia.util.AutentiaConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ProfesorControllerTest.
 */
@ExtendWith(MockitoExtension.class)
public class ProfesorControllerTest implements AutentiaConstants{
	
	/** The profesor service. */
	@Mock
	private ProfesorService profesorService;
	
	/** The profesor controller. */
	@InjectMocks
	private ProfesorController profesorController;
	
	/**
	 * Gets the profesores ok.
	 *
	 * @return the profesores ok
	 */
	@Test
	public void getProfesoresOk() {
		
		Mockito.when(this.profesorService.getAll()).thenReturn(Optional.of(LISTA_PROFESOR));
		
		ResponseEntity<List<Profesor>> response = this.profesorController.getProfesores();
		
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertFalse(response.getBody().isEmpty());
	}
	
	/**
	 * Gets the profesores empty.
	 *
	 * @return the profesores empty
	 */
	@Test
	public void getProfesoresEmpty() {
		
		Mockito.when(this.profesorService.getAll()).thenReturn(Optional.empty());
		
		ResponseEntity<List<Profesor>> response = this.profesorController.getProfesores();
		
		assertEquals(response.getStatusCode(), HttpStatus.NO_CONTENT);
	}
}
