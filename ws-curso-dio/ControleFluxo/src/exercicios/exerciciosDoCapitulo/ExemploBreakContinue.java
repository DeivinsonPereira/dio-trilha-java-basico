package exercicios.exerciciosDoCapitulo;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		
		// Exemplo 1
		for (int numero = 1; numero <= 5 ; numero++) {
			if(numero == 3) {
				continue;
			}
			
			System.out.println(numero);
		}
		
		System.out.println();
		System.out.println("----------");
		System.out.println();
		
		// Exemplo 2
		for (int numero = 1; numero <= 5 ; numero++) {
			if(numero == 3) {
				break;
			}
			
			System.out.println(numero);
		}
	}
}
