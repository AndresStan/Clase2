package org.iesch.ad.DemoSpringDataMongoProductos;

import org.iesch.ad.DemoSpringDataMongoProductos.model.Producto;
import org.iesch.ad.DemoSpringDataMongoProductos.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoSpringDataMongoProductosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataMongoProductosApplication.class, args);
	}

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public void run(String... args) throws Exception {

//		Producto producto = Producto.builder().sku("BY1258XCA").nombre("Coche de juguete").categoria("Juguetes").precio(9.95).stock(12).build();
//		productoRepository.save(producto);

//		List<Producto> productosList = productoRepository.findAll();
//		System.out.println(productosList);

		Optional<Producto> productoTemp = productoRepository.findById("6b072695565f4a956228f6ff");
		if (productoTemp.isPresent()){
			Producto productoReal = productoTemp.get();
			System.out.println(productoReal);

		} else {
			System.out.println("No se ha encontrado el producto");
		}

	}
}
