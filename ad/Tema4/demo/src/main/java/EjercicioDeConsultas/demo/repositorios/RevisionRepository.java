package EjercicioDeConsultas.demo.repositorios;

import EjercicioDeConsultas.demo.modelo.Cliente;
import EjercicioDeConsultas.demo.modelo.Revision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, String> {
}
