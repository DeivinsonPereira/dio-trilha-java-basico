package br.com.dio.java.io.IOBytes.IOObject;

import java.io.Serializable;

//nome, idade, cor;
public class Gato implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	private String cor;
	private boolean castrado;
	private transient boolean ronrona;

	public Gato(String nome, int idade, String cor, boolean castrado, boolean ronrona) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.castrado = castrado;
	}

	public Gato() {

	}

	
	public boolean isRonrona() {
		return ronrona;
	}

	public void setRonrona(boolean ronrona) {
		this.ronrona = ronrona;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", castrado=" + castrado + ", ronrona="
				+ ronrona + "]";
	}

	

	

}
