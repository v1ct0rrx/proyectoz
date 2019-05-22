package com.vvelazquez.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvelazquez.entidades.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> { 
	
	@Query("SELECT per FROM Persona per")
	List<Persona> obtenerPersonas();

}
