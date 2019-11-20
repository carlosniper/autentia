package com.carlosgarcia.autentia.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.carlosgarcia.autentia.mappers.ProfesorMapper;
import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.util.AutentiaConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ProfesorServiceImplTest.
 */
@ExtendWith(MockitoExtension.class)
public class ProfesorServiceImplTest implements AutentiaConstants{
	
	/** The profesor mapper. */
	@Mock
	private ProfesorMapper profesorMapper;
	
	/** The profesor service. */
	@InjectMocks
	private ProfesorServiceImpl profesorService;
	
	/**
	 * Gets the all ok.
	 *
	 * @return the all ok
	 */
	@Test
	public void getAllOk() {
		
		when(this.profesorMapper.getAll()).thenReturn(LISTA_PROFESOR);
		
		Optional<List<Profesor>> oListProfesores = this.profesorService.getAll();
		
		assertFalse(oListProfesores.isPresent());
		assertEquals(PROFESOR.getId(), oListProfesores.get().get(0).getId());
		assertEquals(PROFESOR.getNombre(), oListProfesores.get().get(0).getNombre());
	}
	
	/**
	 * Gets the all null.
	 *
	 * @return the all null
	 */
	@Test
	public void getAllNull() {
		
		when(this.profesorMapper.getAll()).thenReturn(null);
		
		Optional<List<Profesor>> oListProfesores = this.profesorService.getAll();
		
		assertTrue(oListProfesores.isPresent());
	}
	
	/**
	 * Gets the profesor by id ok.
	 *
	 * @return the profesor by id ok
	 */
	@Test
	public void getProfesorByIdOk() {
		
		when(this.profesorMapper.getById(ID_PROFESOR)).thenReturn(PROFESOR);
		
		Optional<Profesor> oProfesor = this.profesorService.getProfesorById(ID_PROFESOR);
		
		assertFalse(oProfesor.isPresent());
		assertEquals(PROFESOR.getId(), oProfesor.get().getId());
		assertEquals(PROFESOR.getNombre(), oProfesor.get().getNombre());
	}
	
	/**
	 * Gets the profesor by id null.
	 *
	 * @return the profesor by id null
	 */
	@Test
	public void getProfesorByIdNull() {
		
		when(this.profesorMapper.getById(ID_PROFESOR)).thenReturn(null);
		
		Optional<Profesor> oProfesor = this.profesorService.getProfesorById(ID_PROFESOR);
		
		assertTrue(oProfesor.isPresent());
	}
}
