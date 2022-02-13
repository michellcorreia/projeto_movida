package projeto.teste.services;

import java.util.List;

import projeto.teste.entities.Aluguel;

public interface AluguelService {

	List<Aluguel> findAll();
	Aluguel findById(Long id);
	Aluguel addAluguel(Aluguel aluguel);
	void deleteById(Long id);
}
