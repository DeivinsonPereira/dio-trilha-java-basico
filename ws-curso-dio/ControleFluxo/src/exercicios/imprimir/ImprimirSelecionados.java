package exercicios.imprimir;

public class ImprimirSelecionados {

	public static void main(String[] args) {

	imprimirSelecionados();
		
	}
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");
		System.out.println();
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° " + indice + 1 + " é o(a) " + candidatos[indice]);
		}
		System.out.println();
		System.out.println("------------");
		System.out.println();
		System.out.println("Forma abreviada de interação for each:");
		System.out.println();
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
}
