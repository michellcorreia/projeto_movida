package projeto.teste.repository;

import org.springframework.stereotype.Repository;
import projeto.teste.entities.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

}
