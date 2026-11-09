package org.iesch.ad.demoCarga.servicios;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoCarga.modelo.Cliente;
import org.iesch.ad.demoCarga.repositorio.ClienteRepositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service // Logica de negocio
public class ClienteService {


    private final ClienteRepositorio clienteRepositorio;

    private static final Logger logger = LoggerFactory.getLogger(ClienteService.class);

    @Transactional
    public void mostrarDatos(long id) {
        logger.trace("Entra en mostrar datos");
        logger.debug("id " + id);
        Optional<Cliente> clienteOptional = clienteRepositorio.findById(1L);
        logger.debug("Se hace la consulta find by id");
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            System.out.println(cliente.getNombre());
            System.out.println(cliente.getId());
            //System.out.println(cliente);
            System.out.println("---".repeat(10));
            System.out.println(cliente.getPedidos().size());
        } else {
            System.out.println("No existe ");
        }
        logger.trace("Sale de mostrar datos");

    }

    @Transactional
    public void mostrarTodos() {
        ArrayList<Cliente> todos = (ArrayList<Cliente>) clienteRepositorio.findAll();
        System.out.println(todos.size());
        System.out.println("#".repeat(30));
        for (Cliente c : todos){
            System.out.println("Pedidos cliente: " + c.getId() + " " + c.getPedidos().size());
        }
    }

    public void arreglaN1() {

        List<Cliente> clienteList = clienteRepositorio.findAllConPedidos();

    }
}
