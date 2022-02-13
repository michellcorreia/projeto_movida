package projeto.teste.services;

import java.util.List;
import projeto.teste.entities.Cliente;

public interface ClienteService {

	List<Cliente> findAll();
	Cliente findById(Long id);
	Cliente addCliente(Cliente cliente);
	void deleteById(Long id);
}
