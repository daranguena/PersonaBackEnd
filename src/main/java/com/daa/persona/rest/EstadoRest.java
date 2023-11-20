package com.daa.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daa.persona.model.Estado;
import com.daa.persona.service.EstadoService;

@RestController
@RequestMapping("/Estados/")
public class EstadoRest {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	private ResponseEntity <List<Estado>> getAllEstados () {
		return ResponseEntity.ok(estadoService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity <List<Estado>> getAllEstadosByPais(@PathVariable("id") Long idPais) {
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
}
