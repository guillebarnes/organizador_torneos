package com.organizador_torneos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrganizadorTorneosApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizadorTorneosApplication.class, args);
	}

}
/*
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Torneo torneo = new Torneo(LocalDateTime.now(), "7ma");
        System.out.println(dtf.format(torneo.getFecha()));
*/
