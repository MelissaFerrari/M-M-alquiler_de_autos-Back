package AgenciaAutros.AgenciaAutos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import AgenciaAutros.AgenciaAutos.service.ClienteService;
import AgenciaAutros.AgenciaAutos.entity.Cliente;



@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/getclientes")
	public List<Cliente> getClientes(){
		return clienteService.getClientes();
	}

}

