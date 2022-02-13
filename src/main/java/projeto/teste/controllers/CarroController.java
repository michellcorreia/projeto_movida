package projeto.teste.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.teste.entities.Carro;
import projeto.teste.services.CarroService;
@Controller
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	CarroService carroService;
	
	@GetMapping("/cadastro")
	public String cadastroCarro(Model model) {
		Carro carroVazio = new Carro();
		model.addAttribute("carroVazio", carroVazio);
		return "/carro/cadastrar";
	}
	
	@PostMapping("/salvar")
	public String salvarCarro(Carro carro, Model model) {
		carroService.addCarro(carro);

		Carro carroVazio = new Carro();
		model.addAttribute("carroVazio", carroVazio);
		return "carro/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listarCarros(Model model) {
		List<Carro> sortedList = carroService.findAll();
		Collections.sort(sortedList);
		model.addAttribute("listaCarros", sortedList);
		return "carro/listar";
	}
	
	@GetMapping("/delete/{id}")
	public String deletarCarro(@PathVariable Long id, Model model) {
		carroService.deleteById(id);
		List<Carro> sortedList = carroService.findAll();
		Collections.sort(sortedList);
		model.addAttribute("listaCarros", sortedList);
		return"carro/listar";
	}
	
	@GetMapping("/edit/{id}")
	public String editarCarro(@PathVariable Long id, Model model) {
		Carro carro = carroService.findById(id);
		model.addAttribute("carroVazio", carro);
		return "/carro/cadastrar";
	}
	
	@GetMapping("/catalogar")
	public String catalogarCarro(Model model) {
		List<Carro> sortedList = carroService.findAll();
		Collections.sort(sortedList);
		model.addAttribute("catalogoCarros", sortedList);
		return "/carro/catalogar";
	}
	
}
