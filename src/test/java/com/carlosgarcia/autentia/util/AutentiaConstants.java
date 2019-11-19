package com.carlosgarcia.autentia.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.carlosgarcia.autentia.model.Curso;
import com.carlosgarcia.autentia.model.Profesor;

public interface AutentiaConstants {

	public static long ID = 1L;
	public static String TITULO_CURSO = "CURSO";
	public static boolean ACTIVO = true;
	public static long ID_PROFESOR = 1L;
	public static float HORAS = 40.0f;
	public static String NIVEL = "BASICO";
	public static String NOMBRE_PROFESOR = "NOMBRE";
	
	public static Curso CURSO = new Curso(ID, TITULO_CURSO, ACTIVO, ID_PROFESOR, HORAS, NIVEL);
	public static List<Curso> LISTA_CURSO = Stream.of(CURSO).collect(Collectors.toList());
	
	public static Profesor PROFESOR = new Profesor(ID_PROFESOR, NOMBRE_PROFESOR);
	public static List<Profesor> LISTA_PROFESOR = Stream.of(PROFESOR).collect(Collectors.toList());
}
