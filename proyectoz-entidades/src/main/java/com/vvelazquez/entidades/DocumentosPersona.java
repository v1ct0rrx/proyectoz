package com.vvelazquez.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="documentos_persona")
public class DocumentosPersona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDocumento;
	
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "DocumentosPersona [idDocumento=" + idDocumento + ", persona=" + persona + "]";
	}
	

}
