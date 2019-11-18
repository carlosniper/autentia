package com.carlosgarcia.autentia.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.service.ProfesorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/profesores")
	public ResponseEntity<List<Profesor>> getProfesores(){
		
		List<Profesor> listProfesor = profesorService.getAll();
		
		if(Objects.nonNull(listProfesor)) {
			return new ResponseEntity<List<Profesor>>(listProfesor, HttpStatus.OK);
		}
		
		return new ResponseEntity<List<Profesor>>(HttpStatus.NOT_FOUND);
		
	}

}
