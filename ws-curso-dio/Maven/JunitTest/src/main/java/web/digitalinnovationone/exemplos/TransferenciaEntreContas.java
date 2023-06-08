package web.digitalinnovationone.exemplos;

public class TransferenciaEntreContas {

	public void transfere(Conta contaOrigem, Conta contaDestino, double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor ou igual a zero!");
		}
	}
	
}
