package projeto.teste.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.teste.entities.Aluguel;
import projeto.teste.repository.AluguelRepository;
import projeto.teste.services.AluguelService;

@Service
public class AluguelServiceImplementation implements AluguelService {

	@Autowired
	AluguelRepository aluguelRepository;
	
	@Override
	public List<Aluguel> findAll() {
		return aluguelRepository.findAll();
	}

	@Override
	public Aluguel findById(Long id) {
		return aluguelRepository.getById(id);
	}

	@Override
	public Aluguel addAluguel(Aluguel aluguel) {
		return aluguelRepository.save(aluguel);
	}

	@Override
	public void deleteById(Long id) {
		aluguelRepository.deleteById(id);
	}	
}
