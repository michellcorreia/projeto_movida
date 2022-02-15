package projeto.teste.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.teste.entities.Carro;
import projeto.teste.repository.CarroRepository;
import projeto.teste.services.CarroService;

@Service
public class CarroServiceImplementation implements CarroService {

	@Autowired
	CarroRepository carroRepository;
	
	@Override
	public List<Carro> findAll() {
		return carroRepository.findAll();
	}

	@Override
	public Carro findById(Long id) {
		return carroRepository.getById(id);
	}

	@Override
	public Carro addCarro(Carro carro) {
		return carroRepository.save(carro);
	}

	@Override
	public void deleteById(Long id) {
		carroRepository.deleteById(id);	
	}
	
	@Override
	public boolean isCarroJaPersistido(Long carroId) {
		if(!(carroRepository.isCarroJaPersistido(carroId) == null)) {
			return true;
		}
		return false;
	}
}
