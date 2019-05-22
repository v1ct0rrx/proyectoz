package com.vvelazquez.servicios.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvelazquez.dao.DocumentosPersonaDao;
import com.vvelazquez.entidades.DocumentosPersona;

@Service(value="DocumentosPersonaService")
public class DocumentosPersonaService implements IDocumentosPersonaService {
	
	@Autowired
	private DocumentosPersonaDao documentoPersonaDao;
	
	@Override
	public List<DocumentosPersona> obtenerDocumentosPersona(){
		return documentoPersonaDao.obtenerDocumentosPersona();
	}
	
	@Override
	public List<DocumentosPersona> obtenerDocumentosPersona2(){
		return documentoPersonaDao.obtenerDocumentosPersona2();
	}

}
