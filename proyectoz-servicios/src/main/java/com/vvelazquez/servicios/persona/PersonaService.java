package com.vvelazquez.servicios.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvelazquez.dao.PersonaDao;
import com.vvelazquez.entidades.Persona;

@Service(value="PersonaService")
public class PersonaService implements IPersonaService {
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> obtenerPersonas() {
		return personaDao.obtenerPersonas();
	}
	
}
