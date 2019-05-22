package com.vvelazquez.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvelazquez.entidades.DocumentosPersona;

public interface DocumentosPersonaDao extends JpaRepository<DocumentosPersona, Integer>{

	@Query("SELECT doc_per FROM DocumentosPersona doc_per")
	List<DocumentosPersona> obtenerDocumentosPersona();
	
	@Query("SELECT NEW com.vvelazquez.entidades.until.DocumentosPersonaUntil(doc_per.idDocumento, per.id) "
			+ "	FROM DocumentosPersona doc_per "
			+ "	INNER JOIN doc_per.persona per ")
	List<DocumentosPersona> obtenerDocumentosPersona2();
	
}
