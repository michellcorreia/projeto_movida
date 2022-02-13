package projeto.teste.services;

import java.util.List;

import projeto.teste.entities.Carro;

public interface CarroService {

	List<Carro> findAll();
	Carro findById(Long id);
	Carro addCarro(Carro carro);
	void deleteById(Long id);
}
