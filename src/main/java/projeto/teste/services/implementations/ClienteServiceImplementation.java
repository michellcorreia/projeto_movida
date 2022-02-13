package projeto.teste.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.teste.entities.Cliente;
import projeto.teste.repository.ClienteRepository;
import projeto.teste.services.ClienteService;

@Service
public class ClienteServiceImplementation implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		return clienteRepository.getById(id);
	}

	@Override
	public Cliente addCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		clienteRepository.deleteById(id);
	}
}
