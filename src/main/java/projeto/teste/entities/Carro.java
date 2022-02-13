package projeto.teste.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="carro")
@Entity
public class Carro implements Comparable<Carro> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="modelo", nullable = false)
	private String modelo;
	
	@Column(name="Cor", nullable = false)
	private String cor;
	
	@Column(name="ano", nullable = false)
	private Integer ano;
	
	@Column(name="fabricante", nullable = false)
	private String fabricante;
	
	public Carro() {

	}
	
	public Carro(String modelo, String cor, Integer ano, String fabricante) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.fabricante = fabricante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(Carro o) {
		return compare(this.id.intValue(), o.id.intValue());
	}
	
	public static int compare (int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
	
}
