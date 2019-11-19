package com.carlosgarcia.autentia.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosgarcia.autentia.mappers.ProfesorMapper;
import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.service.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	private ProfesorMapper profesorMapper;

	@Override
	public Optional<Profesor> getProfesorById(long id) {
		
		Profesor profesor = profesorMapper.getById(id);
		if(Objects.nonNull(profesor)) {
			return Optional.of(profesor);
		}
		return Optional.empty();
	}

	@Override
	public Optional<List<Profesor>> getAll() {
		
		List<Profesor> listProfesor = profesorMapper.getAll();
		
		if(Objects.nonNull(listProfesor)){
			return Optional.of(listProfesor);
		}
		return Optional.empty();
	}
}
