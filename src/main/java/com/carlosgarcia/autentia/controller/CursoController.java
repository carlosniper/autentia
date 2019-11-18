package com.carlosgarcia.autentia.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.service.CursoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/cursos")
	public ResponseEntity<List<Curso>> getCursos(){
		
		System.out.println("Getting all courses...");
		List<Curso> listCursos = cursoService.getAllCursos();
		
		if(Objects.nonNull(cursoService)) {
			System.out.println("cusos: " + listCursos.size());
			return new ResponseEntity<List<Curso>>(listCursos, HttpStatus.OK);
		}
		return new ResponseEntity<List<Curso>>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/curso")
	public ResponseEntity<Curso> insertCurso(@RequestBody Curso curso) {
		
		System.out.println(curso.toString());
		
		if(Objects.nonNull(curso)) {
			cursoService.createCurso(curso);
			Curso cursobbdd = cursoService.getCursoByTitulo(curso.getTitulo());
			System.out.println(cursobbdd);
			return new ResponseEntity<Curso>(cursobbdd, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Curso>(HttpStatus.BAD_REQUEST);
	}

}
