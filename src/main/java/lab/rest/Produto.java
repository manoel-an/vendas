package lab.rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	private String nome;

	public Produto(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Produto() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
