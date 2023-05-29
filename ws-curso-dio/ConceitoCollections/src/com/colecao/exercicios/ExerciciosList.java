package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExerciciosList {

	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione sete notas de um aluno:");

		List<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas);
		System.out.println();

		System.out.println("Exiba a posição da nota 5.0:");
		System.out.println(notas.indexOf(5.0));
		System.out.println();
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4:");
		notas.add(4, 8.0);
		System.out.println("Nota: " + notas.get(4) + " Posição: " + notas.indexOf(8.0));
		System.out.println();
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0:");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println("Notas: " + notas);
		System.out.println();
		
		System.out.println("Confira se a nota 5.0 está na lista:");
		System.out.println("Contém nota 5.0: " + notas.contains(5.0));
		System.out.println();
		
		System.out.println("Exiba todas as notas na ordem em que foram informados:");
		for (Double nota : notas) {
			System.out.print("[ " + nota + "] ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Exiba a terceira nota adicionada:");
		System.out.println("Terceira nota: " + notas.get(2));
		System.out.println();
		
		System.out.println("Exiba a menor nota:");
		System.out.println("Menor nota: " + Collections.min(notas));
		System.out.println();
		
		System.out.println("Exiba a maior nota:");
		System.out.println("Maior nota: " + Collections.max(notas));
		System.out.println();
		
		System.out.println("Exiba a soma dos valores:");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma dos valores: " + soma);
		System.out.println();
		
		System.out.println("Exiba a média das notas:");
		System.out.println("Média das notas: " + (soma / notas.size()));
		System.out.println();
		
		System.out.println("Remova a nota 0.0:");
		notas.remove(0.0);
		System.out.println("Nota 0.0 removida: " + notas);
		System.out.println();
				
		System.out.println("Remova a nota na posição 0:");
		notas.remove(0);
		System.out.println("Nota na posição 0 removida: " + notas);
		System.out.println();
		
		System.out.println("Remova as notas menores que 7 e exiba a lista:");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			double next = iterator1.next();
			if(next < 7.0) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Apague toda a lista:");
		notas.clear();
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Confira se a lista está vazia:");
		System.out.println(notas.isEmpty());
		System.out.println();
		
		//Resolva esses exercicios utilizando os métodos da implementação LinkedList:
		
		System.out.println("Crie uma lista chamada notas2 adicionando todos os elementos da lista notas:");
		LinkedList<Double> notas2 = new LinkedList<>();
		
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		
		System.out.println(notas2);
		System.out.println();
		
		System.out.println("Mostre a primeira nota da nova lista sem removê-la:");
		System.out.println("Primeira nota: " + notas2.getFirst());
		System.out.println();
				
		System.out.println("Mostre a primeira nota da nova lista removendo-a:");
		System.out.println("Primeira nota (removendo-a): " + notas2.removeFirst());
		System.out.println(notas2);
	}

}
