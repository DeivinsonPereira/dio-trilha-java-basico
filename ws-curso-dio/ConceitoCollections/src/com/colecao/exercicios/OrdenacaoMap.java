package com.colecao.exercicios;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {
		
		System.out.println("### Ordem Aleatória ###");
		System.out.println();
		
		Map<String, Livro> livros = new HashMap<>();
		livros.put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
		livros.put("Charles Duhigg", new Livro("O poder do Hábito", 408));
		livros.put("Yuval Noah", new Livro("Lições Para o Século 21", 432));
		
		for(Map.Entry<String, Livro> meusLivros :livros.entrySet()) {
			System.out.println(meusLivros.getKey() + " - " + meusLivros.getValue().getNome());
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("### Ordem de Inserção ###");
		System.out.println();
		
		Map<String, Livro> livros1 = new LinkedHashMap<>();
		livros1.put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
		livros1.put("Charles Duhigg", new Livro("O poder do Hábito", 408));
		livros1.put("Yuval Noah", new Livro("Lições Para o Século 21", 432));
		
		for(Map.Entry<String, Livro> meusLivros :livros1.entrySet()) {
			System.out.println(meusLivros.getKey() + " - " + meusLivros.getValue().getNome());
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("### Ordem alfabética autores: ");
		System.out.println();
		
		Map<String, Livro> livros2 = new TreeMap<>(livros1);
		for(Map.Entry<String, Livro> livro : livros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("### Ordem alfabética nomes dos livros ###");
		System.out.println();
		
		Set<Map.Entry <String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
		livros3.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> livro : livros3) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("### Ordem Numero de Páginas ###");
		System.out.println();
		
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPagina());
		livros4.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> livro : livros4) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
		}
	}
}

class Livro{
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
}

class ComparatorNome implements Comparator <Map.Entry <String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}


}

class ComparatorPagina implements Comparator <Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}
	
}
	
	
	
	
