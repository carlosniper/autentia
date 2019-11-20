package com.carlosgarcia.autentia.service;

import java.util.List;
import java.util.Optional;

import com.carlosgarcia.autentia.model.Profesor;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProfesorService.
 */
public interface ProfesorService {
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public Optional<List<Profesor>> getAll();
	
	/**
	 * Gets the profesor by id.
	 *
	 * @param id the id
	 * @return the profesor by id
	 */
	public Optional<Profesor> getProfesorById(long id);

}
