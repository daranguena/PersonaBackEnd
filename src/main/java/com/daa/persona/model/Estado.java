package com.daa.persona.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name= "Estados")
public class Estado {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO )
	private Long id;
	
	@ManyToOne
	@JoinColumn (name="id_pais")
	private Pais pais;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	private String nombre;
	
	public Pais getPais() {
		return this.pais;
	}
}
