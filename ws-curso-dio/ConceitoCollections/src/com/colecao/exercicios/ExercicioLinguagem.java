package com.colecao.exercicios;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioLinguagem {

	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new TreeSet<>();
		linguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		linguagens.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		linguagens.add(new LinguagemFavorita("Python", 1991, "Visual Studio Code"));
		
		System.out.println("### Ordem de Inserção ###");
		System.out.println();
		for (LinguagemFavorita ling : linguagens) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			System.out.println();
		}
		
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("### Ordem natural (Nome)");
		
		Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
		for (LinguagemFavorita ling : linguagens2) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			System.out.println();
		}
		
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("### Ordem (IDE)");
		System.out.println();
		
		Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
		linguagens3.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		linguagens3.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		linguagens3.add(new LinguagemFavorita("Python", 1991, "Visual Studio Code"));
		
		for (LinguagemFavorita ling : linguagens3) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			System.out.println();
		}
		
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("### Ordem Ano de Criação e Nome ###");
		System.out.println();
		
		Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoNome());
		linguagens4.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		linguagens4.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		linguagens4.add(new LinguagemFavorita("Python", 1991, "Visual Studio Code"));
		
		for (LinguagemFavorita ling : linguagens4) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			System.out.println();
		}
		
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("### Ordem natural Ano de Criação e Nome ###");
		System.out.println();
		
		Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
		linguagens5.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		linguagens5.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		linguagens5.add(new LinguagemFavorita("Python", 1991, "Visual Studio Code"));
		
		for (LinguagemFavorita ling : linguagens5) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			
			System.out.println();
		}
		
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("Exiba as linguagens no cosole, uma abaixo da outra: ");
		System.out.println();
		
		for (LinguagemFavorita ling : linguagens) {
			System.out.println("Linguagem: " + ling.getNome() +
								"\nAno de criação: " + ling.getAnoDeCriacao() +
								"\nIDE utilizada: " + ling.getIde());
			
			System.out.println();
		}
		
		
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	
	private String nome;
	private int anoDeCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return anoDeCriacao == other.anoDeCriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}
	@Override
	public int compareTo(LinguagemFavorita outraLinguagem) {
		return this.getNome().compareToIgnoreCase(outraLinguagem.getNome());
	}
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int lingIde = linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
		if(lingIde != 0) {
			return lingIde;
		}
		return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
	}
	
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int lingAno = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
		if(lingAno != 0) {
			return lingAno;
		}
		return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
	}
	
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int lingNome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
		if(lingNome != 0) {
			return lingNome;
		}
		
		int lingAno = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
		if(lingAno != 0) {
			return lingAno;
		}
		return linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
	}
	
}
