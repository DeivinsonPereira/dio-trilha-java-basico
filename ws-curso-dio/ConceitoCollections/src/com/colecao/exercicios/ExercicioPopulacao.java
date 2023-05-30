package com.colecao.exercicios;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioPopulacao {

	public static void main(String[] args) {
		
		//Estado (sigla), população;
		Map<String, Integer> populacao = new HashMap<>();
		populacao.put("PE", 9616621);
		populacao.put("AL", 3351543);
		populacao.put("CE", 9187103);
		populacao.put("RN", 3534265);
		
		System.out.println(populacao);
		System.out.println();
		
		System.out.println("Substitua a população do estado do RN por 3.534.165");
		System.out.println();
		populacao.put("RN", 3534165);
		
		System.out.println("População RN: " + populacao.get("RN"));
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Confira se o estado PB está no dicionário, caso não adicione : PB - 4.039.277");
		System.out.println();
		
		System.out.println("Contém PB: " + populacao.containsKey("PB"));
		System.out.println();
		populacao.put("PB", 4039277);
		
		System.out.println(populacao);

		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
		System.out.println();
		
		Map<String, Integer> populacao2 = new LinkedHashMap<>();
		populacao2.put("PE", 9616621);
		populacao2.put("AL", 3351543);
		populacao2.put("CE", 9187103);
		populacao2.put("RN", 3534265);
		populacao2.put("PB", 4039277);
		
		System.out.println(populacao2);

		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
		System.out.println();
		Set<Map.Entry<String, Integer>> entries = new TreeSet<>(new ComparatorName());
		entries.addAll(populacao2.entrySet());
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey());
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba o estado com a maior população e sua quantidade: ");
		System.out.println();
		Integer maiorQuantidade = Collections.max(populacao2.values());
		Set<Map.Entry<String, Integer>> entries2 = populacao2.entrySet();
		String estadoMaiorQuantidade = "";
		
		for (Map.Entry<String, Integer> entry : entries2) {
			if(entry.getValue().equals(maiorQuantidade)) {
			estadoMaiorQuantidade = entry.getKey();
			System.out.println("Estado com a maior população: " + estadoMaiorQuantidade + " População: " + maiorQuantidade);
			}
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba o estado com a menor população e sua quantidade: ");
		System.out.println();
		
		Integer menorQuantidade = Collections.min(populacao2.values());
		String estadoMenorQuantidade = "";
		for(Map.Entry<String, Integer> entry : entries2) {
			if(entry.getValue().equals(menorQuantidade)) {
				estadoMenorQuantidade = entry.getKey();
				System.out.println("Estado com a menor população: " + estadoMenorQuantidade + " População: " + menorQuantidade);
			}
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba a soma da população dos estados: ");
		System.out.println();
		Iterator<Integer> iterator = populacao2.values().iterator();
		Integer soma = 0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Soma da população: " + soma);
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Exiba a média da população dos estados: ");
		System.out.println();
		
		System.out.println("Média da população: " + soma / populacao2.size());
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Remova os estados com a população menor que 4.000.000: ");
		System.out.println();
		
		Iterator<Integer> iterator2 = populacao2.values().iterator();
		while(iterator2.hasNext()) {
			if(iterator2.next() < 4000000) {
				iterator2.remove();
			}
		}
		
		System.out.println(populacao2);
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Apague o dicionário de estados: ");
		System.out.println();
		
		populacao2.clear();
		System.out.println("Populaçao: " + populacao2);
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		System.out.println("Confira se o dicionário está vazio: ");
		System.out.println();
		
		System.out.println("Dicionário está vazio: " + populacao2.isEmpty());		
	}
}

class ComparatorName implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> n1, Entry<String, Integer> n2) {
		return n1.getKey().compareToIgnoreCase(n2.getKey());
	}
	
}
