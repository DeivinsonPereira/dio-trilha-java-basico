package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dados as seguintes informações sobre meus gatos, crie uma lista
 * e ordene esta lista exibindo:
 * (nome - idade - cor);
 * 
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */
public class OrdenacaoList {

	public static void main(String[] args) {
		
		List<Gatos> gatos = new ArrayList<>();
		gatos.add(new Gatos("Jon", 18, "Preto"));
		gatos.add(new Gatos("Simba", 6, "tigrado"));
		gatos.add(new Gatos("Jon", 12, "amarelo"));
		
		System.out.println("Ordem de Inserção");
		System.out.println(gatos.toString());
		System.out.println();
		
		System.out.println("Ordem aleatória");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("Ordem natural (nome)");
		Collections.sort(gatos);
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("Ordem idade");
//		Collections.sort(gatos,new ComparatorIdade());
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("Ordem Cor");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("Ordem Nome/Cor/Idade");
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
		
		
	}
}

class Gatos implements Comparable<Gatos> {

	private String nome;
	private int idade;
	private String cor;
	
	public Gatos(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
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
		return "{Nome: " + nome + ", idade: " + idade + ", cor: " + cor + "}" ;
	}

	@Override
	public int compareTo(Gatos gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gatos>{

	@Override
	public int compare(Gatos g1, Gatos g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gatos>{

	@Override
	public int compare(Gatos g1, Gatos g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gatos>{

	@Override
	public int compare(Gatos g1, Gatos g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) {
			return nome;
		}
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) {
			return cor;
		}
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}