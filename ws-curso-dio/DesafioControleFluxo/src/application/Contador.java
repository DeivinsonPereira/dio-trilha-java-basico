package application;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro valor: ");
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int segundoNumero = sc.nextInt();
		try {
			
			contar(primeiroNumero, segundoNumero);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	private static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		
		if(primeiroNumero < segundoNumero) {
			int contagem = segundoNumero - primeiroNumero;
			System.out.println();
			System.out.println("---------");
			System.out.println();
			System.out.println("Contagem dos números: ");
			System.out.println();
			for (int contador = 1; contador <= contagem; contador++) {
				System.out.print("[ "+ contador + " ]");
			}
		}
		else {
			throw new ParametrosInvalidosException();
		}
	}

}