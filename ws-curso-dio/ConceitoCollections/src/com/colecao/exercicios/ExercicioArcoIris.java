package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioArcoIris {

	public static void main(String[] args) {
		
		Set<String> cores = new HashSet<>();
		
		cores.add(("Vermelho"));
		cores.add(("Laranja"));
		cores.add(("Amarelo"));
		cores.add(("Verde"));
		cores.add(("Azul"));
		cores.add(("Anil"));
		cores.add(("Violeta"));
		
		System.out.println("Exibir todas as cores uma embaixo da outra: ");
		System.out.println();
		for (String arcoIris : cores) {
			System.out.println(arcoIris);
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Exiba a quantidade de cores que o arco-íris tem:");
		System.out.println();
		System.out.println("Quantidade de cores: " + cores.size());
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Exiba as cores em ordem alfabética");
		System.out.println();
		
		Set<String> cores2 = new TreeSet<>(cores);
		for (String arcoIris : cores2) {
			System.out.println(arcoIris);
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
		System.out.println();
		
		//Inverter ordem das cores que estavam em ordem alfabética:
		List<String> listaCores = new ArrayList<>(cores2);
		Collections.reverse(listaCores);
		for (String arcoIris : listaCores) {
			System.out.println(arcoIris);
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Exiba todas as cores que começam com a letra V");
		System.out.println();
		for (String arcoIris : listaCores) {
			if(arcoIris.startsWith("V")){
				System.out.println(arcoIris);
			}
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Remova todas as cores que não começam com a letra V");
		System.out.println();
		
		Set<String> conjuntoRemover = new HashSet<>();
		for (String cor : cores) {
			if(cor.startsWith("V")) {
				conjuntoRemover.add(cor);
			}
		}
		cores.removeAll(conjuntoRemover);
		System.out.println(cores);
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Limpe o conjunto");
		System.out.println();
		
		cores.clear();
		System.out.println(cores);
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("Confira se o conjunto está vazio");
		System.out.println();
		System.out.println("Lista de cores está vazia: " + cores.isEmpty());
		
	}
}
