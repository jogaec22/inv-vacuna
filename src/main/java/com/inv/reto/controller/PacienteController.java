package com.inv.reto.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inv.reto.entity.Paciente;
import com.inv.reto.servicios.PacienteServices;

@RestController
@RequestMapping("api/ws/inventario")
public class PacienteController {

	@Autowired
	@Lazy
	private PacienteServices pacienteService;

	@PostMapping(path = "/registrarPaciente")
	public ResponseEntity<Paciente> registrarPaciente(@RequestBody Paciente paciente) {
		try {
			return new ResponseEntity<Paciente>(this.pacienteService.registrarPaciente(paciente), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}
		
	}

	@PostMapping(path = "/getPacientes")
	public ResponseEntity<Collection<Paciente>> getPacientes() {
		try {
			return new ResponseEntity<Collection<Paciente>>(this.pacienteService.getPaciente(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(path = "/eliminarPaciente")
	public void eliminarPaciente(@RequestBody Paciente paciente) {
		this.pacienteService.eliminarPaciente(paciente);
	}

	@PostMapping(path = "/obtenerPacienteById")
	public ResponseEntity<Optional<Paciente>> obtenerPacienteById(@RequestBody Long id) {
		try {
			return new ResponseEntity(this.pacienteService.obtenerPacienteById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}

	}
	
//	@PostMapping(path = "/actualizarPaciente")
//	public Integer actualizarPaciente(@RequestBody Paciente paciente) {
//		return this.pacienteService.actualizarPaciente(paciente);
//	}
	

}
