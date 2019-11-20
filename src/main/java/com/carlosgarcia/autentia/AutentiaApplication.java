package com.carlosgarcia.autentia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carlosgarcia.autentia.mappers.ProfesorMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class AutentiaApplication.
 */
@SpringBootApplication
public class AutentiaApplication {
	
	/** The profesor mapper. */
	@Autowired
	private ProfesorMapper profesorMapper;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AutentiaApplication.class, args);
	}

}
