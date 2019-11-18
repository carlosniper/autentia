package com.carlosgarcia.autentia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carlosgarcia.autentia.mappers.CursoMapper;
import com.carlosgarcia.autentia.mappers.ProfesorMapper;
import com.carlosgarcia.autentia.model.Curso;

@SpringBootTest
class AutentiaApplicationTests {
	
	@Autowired
	private ProfesorMapper profesorMapper;
	
	@Autowired
	private CursoMapper cursoMapper;
	
	@Test
	public void getAllProfesores() {
		profesorMapper.getAll().forEach(p -> System.out.println(p.toString()));
		cursoMapper.getAll().forEach(c -> System.out.println(c.toString()));
		System.out.println(cursoMapper.getById(1).toString());
	}

	@Test
	public void createCurso() {
		
		System.out.println("Creando Curso...");
		Curso curso = new Curso(2,"Titulo curso 40", true, 1, 67, "BASICO");
		
		cursoMapper.insertCurso(curso);
		
		cursoMapper.getAll().forEach(c -> System.out.println(c.toString()));
	}

}
