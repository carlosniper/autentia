package com.carlosgarcia.autentia.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.model.Profesor;

// TODO: Auto-generated Javadoc
/**
 * The Interface AutentiaConstants.
 */
public interface AutentiaConstants {

	/** The id. */
	public static long ID = 1L;
	
	/** The titulo curso. */
	public static String TITULO_CURSO = "CURSO";
	
	/** The activo. */
	public static boolean ACTIVO = true;
	
	/** The id profesor. */
	public static long ID_PROFESOR = 1L;
	
	/** The horas. */
	public static float HORAS = 40.0f;
	
	/** The nivel. */
	public static String NIVEL = "BASICO";
	
	/** The nombre profesor. */
	public static String NOMBRE_PROFESOR = "NOMBRE";
	
	/** The curso. */
	public static Curso CURSO = new Curso(ID, TITULO_CURSO, ACTIVO, ID_PROFESOR, HORAS, NIVEL);
	
	/** The lista curso. */
	public static List<Curso> LISTA_CURSO = Stream.of(CURSO).collect(Collectors.toList());
	
	/** The profesor. */
	public static Profesor PROFESOR = new Profesor(ID_PROFESOR, NOMBRE_PROFESOR);
	
	/** The lista profesor. */
	public static List<Profesor> LISTA_PROFESOR = Stream.of(PROFESOR).collect(Collectors.toList());
}
