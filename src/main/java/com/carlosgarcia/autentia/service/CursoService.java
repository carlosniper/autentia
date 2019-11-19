package com.carlosgarcia.autentia.service;
import java.util.List;
import java.util.Optional;

import com.carlosgarcia.autentia.model.Curso;

public interface CursoService {
	
	public Optional<List<Curso>> getAllCursos();
	
	public Optional<Curso> getCursoById(long id);
	
	public Optional<Curso> getCursoByTitulo(String titulo);
	
	public Optional<Curso> createCurso(Curso curso);

}
