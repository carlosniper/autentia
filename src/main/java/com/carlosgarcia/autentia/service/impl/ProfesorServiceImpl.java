package com.carlosgarcia.autentia.service.impl;

import java.util.List;

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
	public Profesor getProfesorById(long id) {
		return profesorMapper.getById(id);
	}

	@Override
	public List<Profesor> getAll() {
		return profesorMapper.getAll();
	}

}
