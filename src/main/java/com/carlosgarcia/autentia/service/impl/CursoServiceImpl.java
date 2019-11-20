package com.carlosgarcia.autentia.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosgarcia.autentia.mappers.CursoMapper;
import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.service.CursoService;

// TODO: Auto-generated Javadoc
/**
 * The Class CursoServiceImpl.
 */
@Service
public class CursoServiceImpl implements CursoService{
	
	/** The curso mapper. */
	@Autowired
	private CursoMapper cursoMapper;

	/**
	 * Gets the all cursos.
	 *
	 * @return the all cursos
	 */
	@Override
	public Optional<List<Curso>> getAllCursos() {
		
		List<Curso> listCursos = cursoMapper.getAll();
		if(Objects.nonNull(listCursos)) {
			return Optional.of(listCursos);
		}
		return Optional.empty();
	}

	/**
	 * Gets the curso by id.
	 *
	 * @param id the id
	 * @return the curso by id
	 */
	@Override
	public Optional<Curso> getCursoById(long id) {

		Curso curso = cursoMapper.getById(id);
		
		if(Objects.nonNull(curso)) {
			return Optional.of(curso);
		}
		
		return Optional.empty();
	}
	
	/**
	 * Gets the curso by titulo.
	 *
	 * @param titulo the titulo
	 * @return the curso by titulo
	 */
	@Override
	public Optional<Curso> getCursoByTitulo(String titulo) {

		Curso curso = cursoMapper.getByTitulo(titulo);
		
		if(Objects.nonNull(curso)) {
			return Optional.of(curso);
		}
		
		return Optional.empty();
	}

	/**
	 * Creates the curso.
	 *
	 * @param curso the curso
	 * @return the optional
	 */
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
