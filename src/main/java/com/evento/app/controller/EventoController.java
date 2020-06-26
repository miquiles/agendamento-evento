package com.evento.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evento.app.model.Evento;
import com.evento.app.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	
	@RequestMapping(value="/cadastrarevento", method = RequestMethod.GET)
	public String form() {
		return"evento/formevento";
	}
	
	@RequestMapping(value="/cadastrarevento", method = RequestMethod.POST)
	public String form(Evento evento) {
		
		eventoRepository.save(evento);
		return"redirect:/cadastrarevento";
	}
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		Iterable<Evento> eventos = eventoRepository.findAll();
		modelAndView.addObject("eventos", eventos);
		return modelAndView;
		
	}
	
	
	
	
	
	
	
	


	public EventoRepository getEventoRepository() {
		return eventoRepository;
	}


	public void setEventoRepository(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}
}
