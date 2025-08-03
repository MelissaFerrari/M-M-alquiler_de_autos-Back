package AgenciaAutros.AgenciaAutos.repository;


import AgenciaAutros.AgenciaAutos.entity.Reserva;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

	
    @Query("SELECT c FROM Reserva c")
    List<Reserva> obtenerTodasLasReservas();
}


