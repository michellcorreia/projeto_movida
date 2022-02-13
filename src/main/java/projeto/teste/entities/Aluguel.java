package projeto.teste.entities;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="aluguel")
public class Aluguel implements Comparable<Aluguel>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@OneToOne
	@JoinColumn(name="cliente_id", referencedColumnName="id")
	private Cliente cliente;
	
	@Column(name = "data_inicio", nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataInicio;
	
	@Column(name="data_fim", nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFim;
	
	@OneToOne
    @JoinColumn(name = "carro_id", referencedColumnName = "id")
	private Carro carro;
	
	public Aluguel() {

	}
	
	public Aluguel(Cliente cliente, LocalDate dataInicio, LocalDate dataFim, Carro carro) {
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.carro = carro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel other = (Aluguel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(Aluguel o) {
		return compare(this.getId().intValue(), o.getId().intValue());
	}
	
	public static int compare (int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
	
}
