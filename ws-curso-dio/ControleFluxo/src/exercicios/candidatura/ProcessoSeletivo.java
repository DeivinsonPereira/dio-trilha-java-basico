package exercicios.candidatura;

import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("### PROCESSO SELETIVO ###");
		System.out.println();
		System.out.print("Digite o valor do salário pretendido: ");
		double salarioPretendido = sc.nextDouble();
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		analisarCandidato(salarioPretendido);

		sc.close();
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioPretendido < salarioBase) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioPretendido == salarioBase) {
			System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRAPROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}

	}

}
