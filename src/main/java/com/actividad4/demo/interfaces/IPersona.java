package com.actividad4.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.actividad4.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
	

}
