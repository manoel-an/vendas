package lab.rest;

public class Produto {
	Integer codigo;
	String nome;

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

	public Produto() {
	}

	public Produto(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

}
