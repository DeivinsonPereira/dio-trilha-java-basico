package com.colecao.exercicios;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("### Ordem Aleatória ###");
		System.out.println();
		Set<Serie> series = new HashSet<>();
		series.add(new Serie("Got", "Fantasia", 60));
		series.add(new Serie("Dark", "Drama", 60));
		series.add(new Serie("That '70s Show ", "Comédia", 25));
		for (Serie serie : series) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("### Ordem Inserção ###");
		System.out.println();
		Set<Serie> series2 = new LinkedHashSet<>();
		series2.add(new Serie("Got", "Fantasia", 60));
		series2.add(new Serie("Dark", "Drama", 60));
		series2.add(new Serie("That '70s Show ", "Comédia", 25));
		for (Serie serie : series2) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("### Ordem Natural (TempoEpisodio)###");
		System.out.println();
		Set<Serie> series3 = new TreeSet<>();
		series3.add(new Serie("Got", "Fantasia", 60));
		series3.add(new Serie("Dark", "Drama", 60));
		series3.add(new Serie("That '70s Show ", "Comédia", 25));
		for (Serie serie : series3) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		
		System.out.println("### Ordem Nome/Gênero/TempoEpisodio ###");
		Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		series4.addAll(series);
		for (Serie serie : series4) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		
		System.out.println("### Ordem Gênero ###");
		System.out.println();
		Set<Serie>series5 = new TreeSet<>(new ComparatorGenero());
		series5.addAll(series);
		for (Serie serie : series5) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		
		System.out.println("### Ordem Tempo de Episódio ###");
		System.out.println();
		Set<Serie> series6 = new TreeSet<>(new ComparatorTempoEpisodio());
		series6.addAll(series);
		for (Serie serie : series6) {
			System.out.println("Serie: " + serie.getNome() + 
					"\nGênero: " + serie.getGenero() + 
					"\nTempo de Episódio: " + serie.getTempoEpisodio());
			System.out.println();
		}
		
	}
}

class Serie implements Comparable<Serie>{
	
	private String nome;
	private String genero;
	private int tempoEpisodio;
	
	
	public Serie(String nome, String genero, int tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(int tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "Serie: " + nome + "\nGênero: " + genero + "\nTempo de Episódio: " + tempoEpisodio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& tempoEpisodio == other.tempoEpisodio;
	}
	@Override
	public int compareTo(Serie outroTempoEpisodio) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), outroTempoEpisodio.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return this.getGenero().compareTo(outroTempoEpisodio.getGenero());
	}
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie serie1, Serie serie2) {
		int nome = serie1.getNome().compareToIgnoreCase(serie2.getNome());
		if(nome != 0) {
			return nome;
		}
		int genero = serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
		if(genero != 0) {
			return genero;
		}
		return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
	}
}

class ComparatorGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie serie1, Serie serie2) {
		return serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
	}
	
}

class ComparatorTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie serie1, Serie serie2) {
		int tempoEpisodio = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		
		return serie1.getNome().compareToIgnoreCase(serie2.getNome());
		
	}
	
}