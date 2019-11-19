package com.carlosgarcia.autentia.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosgarcia.autentia.mappers.CursoMapper;
import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoMapper cursoMapper;

	@Override
	public Optional<List<Curso>> getAllCursos() {
		
		List<Curso> listCursos = cursoMapper.getAll();
		if(Objects.nonNull(listCursos)) {
			return Optional.of(listCursos);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Curso> getCursoById(long id) {

		Curso curso = cursoMapper.getById(id);
		
		if(Objects.nonNull(curso)) {
			return Optional.of(curso);
		}
		
		return Optional.empty();
	}
	
	@Override
	public Optional<Curso> getCursoByTitulo(String titulo) {

		Curso curso = cursoMapper.getByTitulo(titulo);
		
		if(Objects.nonNull(curso)) {
			return Optional.of(curso);
		}
		
		return Optional.empty();
	}

	@Override
	public Optional<Curso> createCurso(Curso curso) {
		
		cursoMapper.insertCurso(curso);

		Curso cursoDB = cursoMapper.getByTitulo(curso.getTitulo());
		if(Objects.nonNull(cursoDB)) {
			return Optional.of(cursoDB);
		}
		
		return Optional.empty();
	}
}
