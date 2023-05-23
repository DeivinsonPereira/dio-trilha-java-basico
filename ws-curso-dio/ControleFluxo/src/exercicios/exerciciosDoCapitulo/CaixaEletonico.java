package exercicios.exerciciosDoCapitulo;

public class CaixaEletonico {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		
		if(valorSolicitado < saldo)
			saldo = saldo - valorSolicitado;
		
		System.out.printf("Saldo atual: R$%.2f", saldo);
	}
}
