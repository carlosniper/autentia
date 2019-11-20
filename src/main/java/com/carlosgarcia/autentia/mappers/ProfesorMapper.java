package com.carlosgarcia.autentia.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carlosgarcia.autentia.model.Profesor;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProfesorMapper.
 */
@Mapper
public interface ProfesorMapper {
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Select("SELECT * FROM PROFESORES")
	List<Profesor> getAll();
	
	/**
	 * Gets the by id.
	 *
	 * @param id_profesor the id profesor
	 * @return the by id
	 */
	@Select("SELECT * FROM PROFESORES WHERE id_profesor = #{id_profesor}")
	Profesor getById(@Param("id_profesor") long id_profesor);

}
