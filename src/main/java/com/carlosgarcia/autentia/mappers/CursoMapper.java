package com.carlosgarcia.autentia.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carlosgarcia.autentia.model.Curso;

@Mapper
public interface CursoMapper {
	
	@Select("SELECT * FROM CURSOS")
	List<Curso> getAll();
	
	@Select("SELECT * FROM CURSOS WHERE id_curso = #{id_curso}")
	Curso getById(@Param("id_curso") long id_curso);
	
	@Select("SELECT * FROM CURSOS WHERE titulo = #{titulo}")
	Curso getByTitulo(@Param("titulo") String titulo);
	
	@Insert("INSERT INTO CURSOS(titulo, activo, id_profesor, horas, nivel) VALUES(#{titulo}, #{activo}, #{id_profesor}, #{horas}, #{nivel})")
	void insertCurso(Curso curso);

}
