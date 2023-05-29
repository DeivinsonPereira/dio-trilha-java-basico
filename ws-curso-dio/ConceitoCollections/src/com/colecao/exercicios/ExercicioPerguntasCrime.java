package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPerguntasCrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Character> positivas = new ArrayList<>();

		System.out.print("Telefonou para a vítima? ");
		char p1 = sc.next().toUpperCase().charAt(0);
		positivas.add(p1);

		System.out.print("Esteve no local do crime? ");
		char p2 = sc.next().toUpperCase().charAt(0);
		positivas.add(p2);

		System.out.print("Mora perto da vítima? ");
		char p3 = sc.next().toUpperCase().charAt(0);
		positivas.add(p3);

		System.out.print("Devia para a vítima? ");
		char p4 = sc.next().toUpperCase().charAt(0);
		positivas.add(p4);

		System.out.print("Já trabalhou com a vítima? ");
		char p5 = sc.next().toUpperCase().charAt(0);
		positivas.add(p5);

		int respostasSim = 0;
		for (Character sim : positivas) {
			if(sim == 'S') {
				respostasSim++;
			}
		}		
		
		if(respostasSim == 2) {
			System.out.println("Suspeita de cometer o crime");
		}else if(respostasSim == 3 || respostasSim == 4 ) {
			System.out.println("Cúmplice do crime");
		}else if(respostasSim == 5) {
			System.out.println("Assassina");
		}else {
			System.out.println("Inocente");
		}
		
		sc.close();
	}
}
