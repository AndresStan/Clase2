package org.iesch.ad.DemoSpringDataMongoProductos.repositorio;

import org.iesch.ad.DemoSpringDataMongoProductos.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {
}
