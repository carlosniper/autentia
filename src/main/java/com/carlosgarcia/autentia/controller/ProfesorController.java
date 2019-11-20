package com.carlosgarcia.autentia.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlosgarcia.autentia.model.Profesor;
import com.carlosgarcia.autentia.service.ProfesorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("profesores")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping
	public ResponseEntity<List<Profesor>> getProfesores(){
		
		Optional<List<Profesor>> oListProfesor = profesorService.getAll();
		
		if(!oListProfesor.isPresent()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Profesor>>(oListProfesor.get(), HttpStatus.OK);
	}
}
