package com.carlosgarcia.autentia.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carlosgarcia.autentia.model.Curso;

// TODO: Auto-generated Javadoc
/**
 * The Interface CursoMapper.
 */
@Mapper
public interface CursoMapper {
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Select("SELECT * FROM CURSOS")
	List<Curso> getAll();
	
	/**
	 * Gets the by id.
	 *
	 * @param id_curso the id curso
	 * @return the by id
	 */
	@Select("SELECT * FROM CURSOS WHERE id_curso = #{id_curso}")
	Curso getById(@Param("id_curso") long id_curso);
	
	/**
	 * Gets the by titulo.
	 *
	 * @param titulo the titulo
	 * @return the by titulo
	 */
	@Select("SELECT * FROM CURSOS WHERE titulo = #{titulo}")
	Curso getByTitulo(@Param("titulo") String titulo);
	
	/**
	 * Insert curso.
	 *
	 * @param curso the curso
	 */
	@Insert("INSERT INTO CURSOS(titulo, activo, id_profesor, horas, nivel) VALUES(#{titulo}, #{activo}, #{id_profesor}, #{horas}, #{nivel})")
	void insertCurso(Curso curso);

}
