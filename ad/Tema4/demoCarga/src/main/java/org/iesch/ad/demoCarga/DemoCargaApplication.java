package org.iesch.ad.demoCarga;

import org.iesch.ad.demoCarga.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCargaApplication implements CommandLineRunner {

	@Autowired
	ClienteService clienteService;


	public static void main(String[] args) {
		SpringApplication.run(DemoCargaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// Lanzar la app.
		//System.out.println("Datos del cliente 1");
		//clienteService.mostrarDatos(1L);

		System.out.println("Muestro todos");
		clienteService.mostrarTodos();

		//Arreglo N+1 Consultas
		System.out.println("\n".repeat(10));
		clienteService.arreglaN1();
	}
}
