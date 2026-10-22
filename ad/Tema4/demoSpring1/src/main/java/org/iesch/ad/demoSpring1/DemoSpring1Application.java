package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
@PropertySource(value = "classpath:mi.properties", encoding = "UTF-8")
public class DemoSpring1Application implements CommandLineRunner {

	@Autowired
	PersonaRepositorio personaRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
/*
		Persona p = Persona.builder().nombre("Andres").apellidos("Stan").dni("61091513V").email("aastan@iesch.org").build();
		Persona p1 = Persona.builder().nombre("Luis").apellidos("Gabriel").dni("66666666F").email("antonica@gmail.com").build();
		Persona p2 = Persona.builder().nombre("Pescador").apellidos("Mar").dni("11111111W").email("pescanova@salmon.com").build();
		Persona p3 = Persona.builder().nombre("Pepito").apellidos("Grillo").dni("12121212S").email("pepito@grillo.com").build();

		List<Persona> personaList = new ArrayList<>(Arrays.asList(p, p1, p2 , p3));
		personaRepositorio.saveAll(personaList);

*/

		// CRUD
		List<Persona> personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);
	}

}
