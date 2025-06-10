package AgenciaAutros.AgenciaAutos.repository;

import AgenciaAutros.AgenciaAutos.entity.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

	
    @Query("SELECT c FROM Cliente c")
    List<Cliente> obtenerTodosLosClientes();
}
