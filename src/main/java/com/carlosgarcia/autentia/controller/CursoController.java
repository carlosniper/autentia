package com.carlosgarcia.autentia.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.service.CursoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("cursos")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public ResponseEntity<List<Curso>> getCursos(){
		
		Optional<List<Curso>> oListCursos = cursoService.getAllCursos();
		
		if(!oListCursos.isPresent()) {
			return new ResponseEntity<List<Curso>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Curso>>(oListCursos.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Curso> insertCurso(@RequestBody Curso curso) {
				
		if(Objects.nonNull(curso)) {
			Optional<Curso> oCurso = cursoService.createCurso(curso);
			if(oCurso.isPresent()) {
				return new ResponseEntity<Curso>(oCurso.get(), HttpStatus.CREATED);
			}
			else {
				return new ResponseEntity<Curso>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		return new ResponseEntity<Curso>(HttpStatus.BAD_REQUEST);
	}
}
