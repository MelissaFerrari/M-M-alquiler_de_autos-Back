package AgenciaAutros.AgenciaAutos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import AgenciaAutros.AgenciaAutos.entity.Reserva;
import AgenciaAutros.AgenciaAutos.service.ReservaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/getreservas")
    public List<Reserva> getReservas() {
        return reservaService.getReservas();
    }
}

