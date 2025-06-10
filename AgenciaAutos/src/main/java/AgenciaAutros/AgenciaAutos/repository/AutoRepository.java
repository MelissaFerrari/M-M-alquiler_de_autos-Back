package AgenciaAutros.AgenciaAutos.repository;

import AgenciaAutros.AgenciaAutos.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, String> {
    // String es el tipo de la clave primaria (dominio)
    
    // Ejemplo de método personalizado si querés más adelante:
    // List<Auto> findByAlquilado(boolean alquilado);
}

