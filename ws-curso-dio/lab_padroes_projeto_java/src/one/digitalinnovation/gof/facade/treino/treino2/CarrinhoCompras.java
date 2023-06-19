package one.digitalinnovation.gof.facade.treino.treino2;

public class CarrinhoCompras {

	private CarrinhoCompras() {
		
	}
	
	public static double adicionarItem(double valor) {
		double soma = valor; 
		System.out.println("Item adicionado ao carrinho");
		return soma;
	}
}
