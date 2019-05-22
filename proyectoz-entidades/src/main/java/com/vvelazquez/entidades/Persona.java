package com.vvelazquez.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiParam;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiParam(required=false)
	private Integer id;
	
	@ApiParam(required=true, name="nombre_completo")
	@Column(name="nombre_completo")
	private String nombreCompleto;
	
	@ApiParam(required=false)
	private Integer edad;
	
	@ApiParam(required=false)
	private String telefono;
	
	@OneToMany(mappedBy="persona")
	private List<DocumentosPersona> documentosPersona;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", telefono=" + telefono
				+ "]";
	}
}
