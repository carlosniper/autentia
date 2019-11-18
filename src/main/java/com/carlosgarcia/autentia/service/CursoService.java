package com.carlosgarcia.autentia.service;
import java.util.List;

import com.carlosgarcia.autentia.model.Curso;

public interface CursoService {
	
	public List<Curso> getAllCursos();
	
	public Curso getCursoById(long id);
	
	public Curso getCursoByTitulo(String titulo);
	
	public Curso createCurso(Curso curso);

}
