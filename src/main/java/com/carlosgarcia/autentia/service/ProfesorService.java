package com.carlosgarcia.autentia.service;

import java.util.List;

import com.carlosgarcia.autentia.model.Profesor;

public interface ProfesorService {
	
	public List<Profesor> getAll();
	
	public Profesor getProfesorById(long id);

}
