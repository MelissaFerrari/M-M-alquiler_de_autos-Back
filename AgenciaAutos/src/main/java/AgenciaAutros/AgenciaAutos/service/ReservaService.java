package AgenciaAutros.AgenciaAutos.service;

import AgenciaAutros.AgenciaAutos.entity.Reserva;
import AgenciaAutros.AgenciaAutos.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getReservas() {
        return reservaRepository.obtenerTodasLasReservas();
    }
    
    public Reserva agregarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}
