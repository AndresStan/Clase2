package EjercicioDeConsultas.demo.repositorios;

import EjercicioDeConsultas.demo.modelo.Cliente;
import EjercicioDeConsultas.demo.modelo.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CocheRepository extends JpaRepository<Coche, String> {

}
