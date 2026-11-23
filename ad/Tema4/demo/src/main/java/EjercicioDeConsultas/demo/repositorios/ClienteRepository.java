package EjercicioDeConsultas.demo.repositorios;

import EjercicioDeConsultas.demo.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findDistinctByCochesColorIgnoreCase(String color);

    List<Cliente> findDistinctByCochesPrecioGreaterThan(BigDecimal precio);

    @Query("SELECT c FROM Cliente c ORDER BY SIZE(c.coches) DESC LIMIT 1")
    buscarPorMayorCantidadDeTenienteDeCoches();
}
