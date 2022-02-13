package projeto.teste.repository;

import org.springframework.stereotype.Repository;
import projeto.teste.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
