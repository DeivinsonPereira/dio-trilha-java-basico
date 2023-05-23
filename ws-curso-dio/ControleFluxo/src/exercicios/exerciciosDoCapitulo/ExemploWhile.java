package exercicios.exerciciosDoCapitulo;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double mesada = 50.0;

		while (mesada > 0) {
			Double valorDoce = valorAleatorio();
			if (valorDoce > mesada) 
				valorDoce = mesada;
			
			System.out.printf("Doce do valor: R$%.2f adicionado no carrinho\n", valorDoce);
			mesada = mesada - valorDoce;
		}		
			
			System.out.printf("\nMesada: R$%.2f", mesada);
			System.out.println("\nJoãozinho gastou toda a sua mesada em doces");
		

	}

	private static Double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(5, 10);
	}
}
