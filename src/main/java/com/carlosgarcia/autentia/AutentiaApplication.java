package com.carlosgarcia.autentia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carlosgarcia.autentia.mappers.ProfesorMapper;

@SpringBootApplication
public class AutentiaApplication {
	
	@Autowired
	private ProfesorMapper profesorMapper;

	public static void main(String[] args) {
		SpringApplication.run(AutentiaApplication.class, args);
	}

}
