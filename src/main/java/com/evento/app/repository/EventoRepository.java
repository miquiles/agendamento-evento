package com.evento.app.repository;

import org.springframework.data.repository.CrudRepository;


import com.evento.app.model.Evento;


public interface EventoRepository extends CrudRepository<Evento, Long> {
	
	

}
