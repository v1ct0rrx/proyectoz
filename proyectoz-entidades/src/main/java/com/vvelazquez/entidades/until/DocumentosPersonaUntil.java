package com.vvelazquez.entidades.until;

public class DocumentosPersonaUntil {
	
	private Integer idDocumento;
	
	private Integer idPersona;

	public DocumentosPersonaUntil(Integer idDocumento, Integer idPersona) {
		super();
		this.idDocumento = idDocumento;
		this.idPersona = idPersona;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "DocumentosPersonaUntil [idDocumento=" + idDocumento + ", idPersona=" + idPersona + "]";
	}
	
}
