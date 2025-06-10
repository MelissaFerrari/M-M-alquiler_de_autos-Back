package AgenciaAutros.AgenciaAutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import AgenciaAutros.AgenciaAutos.entity.Reserva;
import AgenciaAutros.AgenciaAutos.service.ReservaService;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/getreservas")
    public List<Reserva> getReservas() {
        return reservaService.getReservas();
    }
}

