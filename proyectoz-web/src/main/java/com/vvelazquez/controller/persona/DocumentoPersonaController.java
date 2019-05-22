package com.vvelazquez.controller.persona;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vvelazquez.entidades.DocumentosPersona;
import com.vvelazquez.servicios.persona.IDocumentosPersonaService;

@RestController
@RequestMapping("documentos-persona/")
public class DocumentoPersonaController {
	
	@Resource(name="DocumentosPersonaService")
	private IDocumentosPersonaService documentoPersonaService;
	
	@GetMapping("obtener-documentos-persona")
	public List<DocumentosPersona> obtenerDocumentosPersona(){
		return documentoPersonaService.obtenerDocumentosPersona();
	}
	
	@GetMapping("obtener-documentos-persona-2")
	public List<DocumentosPersona> obtenerDocumentosPersona2(){
		return documentoPersonaService.obtenerDocumentosPersona2();
	}

}
