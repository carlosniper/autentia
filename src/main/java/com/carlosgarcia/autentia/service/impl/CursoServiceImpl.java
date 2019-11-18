package com.carlosgarcia.autentia.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	public List<Curso> getAllCursos() {
		
		List<Curso> listCursos = cursoMapper.getAll();
		if(Objects.nonNull(listCursos)) {
			return listCursos;
		}
		return new ArrayList<Curso>(); 
	}

	@Override
	public Curso getCursoById(long id) {

		Curso curso = cursoMapper.getById(id);
		
		return curso;
	}
	
	@Override
	public Curso getCursoByTitulo(String titulo) {

		Curso curso = cursoMapper.getByTitulo(titulo);
		System.out.println(curso);
		
		return curso;
	}

	@Override
	public Curso createCurso(Curso curso) {
		
		cursoMapper.insertCurso(curso);
		
		return curso;
	}
}
