package AgenciaAutros.AgenciaAutos.service;


import AgenciaAutros.AgenciaAutos.entity.Auto;
import AgenciaAutros.AgenciaAutos.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    @Autowired
    AutoRepository autoRepository;

    public List<Auto> getAutos() {
        return autoRepository.findAll();
    }
}
