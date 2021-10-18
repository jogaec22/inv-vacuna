package com.inv.reto.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.inv.reto.entity.Paciente;

//@Repository
public abstract class PacienteRepository implements IPacienteRepository {
	
	@PersistenceContext
    private EntityManager entityManager;

	
	public Integer actualizarPaciente(Paciente paciente) {
		String hsql = "update Paciente e set e.nombre = '"+ paciente.getNombres().toString()  +"' where e.id"+paciente.getId().toString();
        Query query = entityManager.createQuery(hsql);
        entityManager.flush();
        Integer result = query.executeUpdate();
        entityManager.clear();
        return result;
	}
}
