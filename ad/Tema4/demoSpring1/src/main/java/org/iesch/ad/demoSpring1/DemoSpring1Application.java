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
import java.util.Optional;

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
		Persona p2 = Persona.builder().nombre("Pescador").apellidos("Mar").dni("11111111W").build();
		Persona p3 = Persona.builder().nombre("Pepito").apellidos("Grillo").dni("12121212S").email("pepito@grillo.com").build();

		List<Persona> personaList = new ArrayList<>(Arrays.asList(p, p1, p2 , p3));
		personaRepositorio.saveAll(personaList);

*/
		/*
		Persona p = new Persona();
		p.setNombre("Juanjo");
		p.setApellidos("Zuñiga Anton");
		System.out.println(p);
		personaRepositorio.save(p);
		System.out.println(p);
		// CRUD
*/
/*
		//select *
		List<Persona> personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);

		// select * from ___ where id = 4;
		Optional<Persona> personaEncontradaPorId = personaRepositorio.findById(2L);

		if (personaEncontradaPorId.isPresent()){
			Persona p = personaEncontradaPorId.get();
			System.out.println(p);
		} else {
			System.out.println("Persona no encontrada");
		}

		//Update (Con personaEncontradaPorId)
		if (personaEncontradaPorId.isPresent()){

			Persona p = personaEncontradaPorId.get();
			p.setNombre("Joaquin");
			p.setApellidos("Se me cae");
			p.setDni("61091513R");
			p.setEmail("quino@aa.es");

			personaRepositorio.save(p);


		} else {
			System.out.println("No se ha podido modificar la persona por no coincidencia");
		}

		personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);

		// Delete
		Optional<Persona> personaAborrar = personaRepositorio.findById(4L);

		if (personaAborrar.isPresent()) {
			Persona personaborra = personaAborrar.get();
			personaRepositorio.delete(personaborra);
		} else {
			System.out.println("No se ha encontrado la persona a borrar");
		}

		Persona personatmp = new Persona();
		personatmp.setId(3L);
		personaRepositorio.delete(personatmp);

*/

		List<Persona> listaPersonas = personaRepositorio.buscaTodasPersonas();
		System.out.println(listaPersonas);

		List<Persona> listaPersonasNative = personaRepositorio.buscaTodasPersonasNative();
		System.out.println(listaPersonasNative);

		// PSEUDO LENGUAJE
		System.out.println("Pseudo-lenguaje");

		List<Persona> personaListComienzaPorLetra = personaRepositorio.findByNombreStartingWith('P');
		//System.out.println(personaListComienzaPorLetra);

		// Buscamos las personas cuyas letras del dni sea a y el apellido contenga una R
		List<Persona> personaListContieneDniyContieneApellido = personaRepositorio.findByDniContainingAndApellidosContaining('V', 't');
		System.out.println(personaListContieneDniyContieneApellido);
	}

}
