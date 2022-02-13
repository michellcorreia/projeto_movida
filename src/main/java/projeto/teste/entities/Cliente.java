package projeto.teste.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="cpf", nullable = false)
	private String cpf;
	
	@Column(name="idade", nullable = false)
	private Integer idade;
	
	@Column(name="renda", nullable = false)
	private Double renda;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, Integer idade, Double renda) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.renda = renda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	
}
