package entities;

public class Gerente {

	private String nome;
	private int idade;
	
	public Gerente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
}
