package projeto.teste.controllers;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.teste.entities.Aluguel;
import projeto.teste.entities.Carro;
import projeto.teste.entities.Cliente;
import projeto.teste.services.AluguelService;
import projeto.teste.services.CarroService;
import projeto.teste.services.ClienteService;

@Controller
@RequestMapping("/aluguel")
public class AluguelController {
	
	@Autowired
	CarroService carroService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	AluguelService aluguelService;

	@GetMapping("/novo/{id}")
	public String novoAluguel(@PathVariable Long id, Model model) {
		Carro carro =carroService.findById(id);
		Aluguel aluguel = new Aluguel();
		aluguel.setCarro(carro);
		aluguel.setCliente(new Cliente());
		model.addAttribute("aluguel", aluguel);
		return "aluguel/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listarAlugueis(Model model) {
		List<Aluguel> lista = aluguelService.findAll();
		Collections.sort(lista);
		model.addAttribute("alugueis", lista);
		return "aluguel/listar";
	}
	
	@PostMapping("/salvar")
	public String salvarAluguel(Aluguel aluguel, Model model) throws ParseException {
		Cliente cliente = clienteService.addCliente(aluguel.getCliente());
		aluguel.getCliente().setId(cliente.getId());
		
		aluguelService.addAluguel(aluguel);
		return "redirect:/carro/catalogar";
	}
}
