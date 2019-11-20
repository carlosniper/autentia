package com.carlosgarcia.autentia.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosgarcia.autentia.mappers.ProfesorMapper;
import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.service.ProfesorService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProfesorServiceImpl.
 */
@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	/** The profesor mapper. */
	@Autowired
	private ProfesorMapper profesorMapper;

	/**
	 * Gets the profesor by id.
	 *
	 * @param id the id
	 * @return the profesor by id
	 */
	@Override
	public Optional<Profesor> getProfesorById(long id) {
		
		Profesor profesor = profesorMapper.getById(id);
		if(Objects.nonNull(profesor)) {
			return Optional.of(profesor);
		}
		return Optional.empty();
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Optional<List<Profesor>> getAll() {
		
		List<Profesor> listProfesor = profesorMapper.getAll();
		
		if(Objects.nonNull(listProfesor)){
			return Optional.of(listProfesor);
		}
		return Optional.empty();
	}
}
