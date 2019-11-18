package com.carlosgarcia.autentia.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carlosgarcia.autentia.model.Profesor;

@Mapper
public interface ProfesorMapper {
	
	@Select("SELECT * FROM PROFESORES")
	List<Profesor> getAll();
	
	@Select("SELECT * FROM PROFESORES WHERE id_profesor = #{id_profesor}")
	Profesor getById(@Param("id_profesor") long id_profesor);

}
