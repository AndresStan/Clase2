package EjercicioDeConsultas.demo.servicios;

import EjercicioDeConsultas.demo.modelo.Cliente;
import EjercicioDeConsultas.demo.modelo.Coche;
import EjercicioDeConsultas.demo.repositorios.ClienteRepository;
import EjercicioDeConsultas.demo.repositorios.CocheRepository;
import EjercicioDeConsultas.demo.repositorios.RevisionRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    CocheRepository cocheRepository;

    @Autowired
    RevisionRepository revisionRepository;

    public List<Cliente> clientesPorColor(String color) {
        return clienteRepository.findDistinctByCochesColorIgnoreCase(color);
    }


    public List<Cliente> clientesPorPrecioMayorQue(BigDecimal precio) {
        return clienteRepository.findDistinctByCochesPrecioGreaterThan(precio);
    }


    public List<Object> clientesConMasCoches() {


         clienteRepository.buscarPorMayorCantidadDeTenienteDeCoches();

    }
}
