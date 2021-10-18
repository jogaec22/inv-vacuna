package com.inv.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inv.reto.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

//	Integer actualizarPaciente(Paciente paciente);


}
