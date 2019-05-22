package com.vvelazquez.controller.persona;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vvelazquez.entidades.Persona;
import com.vvelazquez.servicios.persona.IPersonaService;

@RestController
@RequestMapping("personas/")
public class PersonaController {

	@Resource(name = "PersonaService")
	private IPersonaService personaService;

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

	@GetMapping("obtener-personas")
	public List<Persona> obtenerPersonas() {
		LOGGER.debug("Hola mundo");
		return personaService.obtenerPersonas();
	}

}
