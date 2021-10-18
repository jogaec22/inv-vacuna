package com.inv.reto.servicios;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inv.reto.entity.Paciente;
import com.inv.reto.repository.IPacienteRepository;

@Service
public class PacienteServices {

	@Autowired
	private IPacienteRepository pacienteRepository;

	/**
	 * registrarPaciente.
	 * 
	 * @return
	 */
	public Paciente registrarPaciente(Paciente pacienteVO) {
		return this.pacienteRepository.save(pacienteVO);
	}

	/**
	 * getPaciente.
	 * 
	 * @return
	 */
	public Collection<Paciente> getPaciente() {
		return this.pacienteRepository.findAll();
	}

	/**
	 * getPaciente.
	 * 
	 * @return
	 */
	public void eliminarPaciente(Paciente paciente) {
		this.pacienteRepository.delete(paciente);
	}

	/**
	 * obtenerPacienteById.
	 * 
	 * @return
	 */
	public Optional<Paciente> obtenerPacienteById(Long id) {
		return this.pacienteRepository.findById(id);
	}
	
//	public Integer actualizarPaciente(Paciente paciente) {
//		return this.pacienteRepository.actualizarPaciente(paciente);
//	}

}
