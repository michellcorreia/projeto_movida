package projeto.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projeto.teste.entities.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

@Query(value = "SELECT c.* FROM Carro c INNER JOIN Aluguel a ON c.id = a.carro_id WHERE c.id = ?1 LIMIT 1", nativeQuery = true)
public Carro isCarroJaPersistido(Long carroId);
}