package com.carlosgarcia.autentia.service;

import java.util.List;
import java.util.Optional;

import com.carlosgarcia.autentia.model.Profesor;

public interface ProfesorService {
	
	public Optional<List<Profesor>> getAll();
	
	public Optional<Profesor> getProfesorById(long id);

}
