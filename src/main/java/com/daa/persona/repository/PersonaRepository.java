package com.daa.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daa.persona.model.Persona;

public interface PersonaRepository extends JpaRepository <Persona, Long>{

}
