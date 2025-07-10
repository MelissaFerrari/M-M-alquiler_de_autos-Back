package AgenciaAutros.AgenciaAutos.service;

import AgenciaAutros.AgenciaAutos.entity.Auto;
import AgenciaAutros.AgenciaAutos.entity.Reserva;
import AgenciaAutros.AgenciaAutos.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

 //GET 
    public List<Reserva> getReservas() {
        return reservaRepository.obtenerTodasLasReservas();
    }
    
//POST
    public Reserva agregarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    
 //DELETE       
    /*  public boolean eliminarReserva(Integer id) { //originalmente era String pero aca el id es int
        if (reservaRepository.existsById(id)) {
            reservaRepository.deleteById(id);
            return true;
        }
        return false;
    }

//PUT   
  public boolean existeReserva(Integer id) {  //originalmente era String pero aca el id es int
        return reservaRepository.existsById(id);
    }

    public Reserva actualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }*/
}
