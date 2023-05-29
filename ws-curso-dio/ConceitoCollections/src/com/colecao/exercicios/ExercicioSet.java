package com.colecao.exercicios;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {

	public static void main(String[] args) {

		System.out.println("Crie um conjunto e adicione as notas:");

		Set<Double> notas = new HashSet<>();

		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);

		System.out.println(notas);
		System.out.println();

		System.out.println("Exiba a posição da nota 5.0: ");
		System.out.println("não é possível fazer essa operação com a operação Set");
		System.out.println();

		System.out.println("Adicione na lista a nota 8.0 na posição 4:");
		System.out.println("não é possível fazer essa operação com a operação Set");
		System.out.println();

		System.out.println("Substitua a nota 5.0 pela nota 6.0:");
		System.out.println("não é possível fazer essa operação com a operação Set");
		System.out.println();

		System.out.println("Confira se a nota 5.0 está no conjunto:");
		System.out.println("Existe nota 5.0 no conjunto: " + notas.contains(5.0));

		System.out.println("Exiba a terceira nota adicionada: ");
		System.out.println("não é possível fazer essa operação com a operação Set");
		System.out.println();

		System.out.println("Exiba a menor nota: ");
		System.out.println("Menor nota: " + Collections.min(notas));
		System.out.println();

		System.out.println("Exiba a maior nota: ");
		System.out.println("Maior nota: " + Collections.max(notas));
		System.out.println();

		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterate = notas.iterator();
		double soma = 0.0;
		while (iterate.hasNext()) {
			double next = iterate.next();
			soma += next;
		}
		System.out.println("Soma dos valores: " + String.format("%.2f", soma));
		System.out.println();

		System.out.println("Exiba a média dos valores: ");
		System.out.println("Média: " + String.format("%.2f", soma / notas.size()));
		System.out.println();

		System.out.println("Remova a nota 0.0: ");
		notas.remove(0.0);
		System.out.println(notas);
		System.out.println();

		System.out.println("Remova a nota na posição 0: ");
		System.out.println("não é possível fazer essa operação com a operação Set");
		System.out.println();

		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7.0) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		System.out.println(notas2);
		System.out.println();
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		System.out.println();
		
		System.out.println("Apague todo o Conjunto: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se o conjunto está vazio: ");
		System.out.println("Conjunto está vazio: " + notas.isEmpty());
		
	}
}
