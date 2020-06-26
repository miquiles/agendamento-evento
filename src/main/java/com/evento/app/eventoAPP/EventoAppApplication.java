package com.evento.app.eventoAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.evento.app.repository") // pacote onde está meu repository
@EntityScan(basePackages = "com.evento.app.model")
@ComponentScan({"com.evento.app.controller"})
public class EventoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoAppApplication.class, args);
	}

}
