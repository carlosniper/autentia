package com.carlosgarcia.autentia.service;
import java.util.List;
import java.util.Optional;

import com.carlosgarcia.autentia.model.Curso;

// TODO: Auto-generated Javadoc
/**
 * The Interface CursoService.
 */
public interface CursoService {
	
	/**
	 * Gets the all cursos.
	 *
	 * @return the all cursos
	 */
	public Optional<List<Curso>> getAllCursos();
	
	/**
	 * Gets the curso by id.
	 *
	 * @param id the id
	 * @return the curso by id
	 */
	public Optional<Curso> getCursoById(long id);
	
	/**
	 * Gets the curso by titulo.
	 *
	 * @param titulo the titulo
	 * @return the curso by titulo
	 */
	public Optional<Curso> getCursoByTitulo(String titulo);
	
	/**
	 * Creates the curso.
	 *
	 * @param curso the curso
	 * @return the optional
	 */
	public Optional<Curso> createCurso(Curso curso);

}
