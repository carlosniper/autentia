package com.carlosgarcia.autentia.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.carlosgarcia.autentia.mappers.CursoMapper;
import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.util.AutentiaConstants;

@ExtendWith(MockitoExtension.class)
public class CursoServiceImplTest implements AutentiaConstants{
	
	@Mock
	private CursoMapper cursoMapper;
	
	@InjectMocks
	private CursoServiceImpl cursoService;
	
	@Test
	void getAllOk() {
		
		when(this.cursoMapper.getAll()).thenReturn(LISTA_CURSO);
		
		Optional<List<Curso>> oListCursos = this.cursoService.getAllCursos();
		
		assertFalse(oListCursos.isEmpty());
		assertEquals(LISTA_CURSO.size(), oListCursos.get().size());
		assertEquals(LISTA_CURSO.get(0).getId(), oListCursos.get().get(0).getId());
		assertEquals(LISTA_CURSO.get(0).getHoras(), oListCursos.get().get(0).getHoras());
		assertEquals(LISTA_CURSO.get(0).getId_profesor(), oListCursos.get().get(0).getId_profesor());
		assertEquals(LISTA_CURSO.get(0).getNivel(), oListCursos.get().get(0).getNivel());
		assertEquals(LISTA_CURSO.get(0).getTitulo(), oListCursos.get().get(0).getTitulo());
	}
	
	@Test
	void getAllNull() {
		
		when(this.cursoMapper.getAll()).thenReturn(null);
		
		Optional<List<Curso>> oListCursos = this.cursoService.getAllCursos();
		
		assertTrue(oListCursos.isEmpty());
	}
	
	@Test
	public void getCursoByIdOk() {
		
		when(this.cursoMapper.getById(ID)).thenReturn(CURSO);
		
		Optional<Curso> oCurso = this.cursoService.getCursoById(ID);
		
		assertFalse(oCurso.isEmpty());
	}
	
	@Test
	public void getCursoByIdNull() {
		
		when(this.cursoMapper.getById(ID)).thenReturn(null);
		
		Optional<Curso> oCurso = this.cursoService.getCursoById(ID);
		
		assertTrue(oCurso.isEmpty());
	}
	
	@Test
	public void getCursoByTituloOk() {
		
		when(this.cursoMapper.getByTitulo(TITULO_CURSO)).thenReturn(CURSO);
		
		Optional<Curso> oCurso = this.cursoService.getCursoByTitulo(TITULO_CURSO);
		
		assertFalse(oCurso.isEmpty());
	}
	
	@Test
	public void getCursoByTituloNull() {
		when(this.cursoMapper.getByTitulo(TITULO_CURSO)).thenReturn(null);
		
		Optional<Curso> oCurso = this.cursoService.getCursoByTitulo(TITULO_CURSO);
		
		assertTrue(oCurso.isEmpty());
	}
	
	@Test
	public void createCursoOk() {

		when(this.cursoMapper.getByTitulo(TITULO_CURSO)).thenReturn(CURSO);
		
		Optional<Curso> oCurso = this.cursoService.createCurso(CURSO);
		
		Mockito.verify(this.cursoMapper).insertCurso(Mockito.any());
		assertFalse(oCurso.isEmpty());
	}
	
	@Test
	public void createCursoNull() {
		
		when(this.cursoMapper.getByTitulo(TITULO_CURSO)).thenReturn(null);
		
		Optional<Curso> oCurso = this.cursoService.createCurso(CURSO);
		
		Mockito.verify(this.cursoMapper).insertCurso(Mockito.any());
		assertTrue(oCurso.isEmpty());
	}
}
