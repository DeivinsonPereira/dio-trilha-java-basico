package one.digitalinnovation.gof.facade.treino.treino2;

public class GerenciadorProdutos {

	public void gerenciarCarrinho() {
		double add = CarrinhoCompras.adicionarItem(300.00);
		
		Compra.getInstancia().calcularTotal(add);
	}
}
