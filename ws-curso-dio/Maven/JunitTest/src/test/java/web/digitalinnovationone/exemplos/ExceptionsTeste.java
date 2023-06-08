package web.digitalinnovationone.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTeste {

	@Test
	void validaCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta("123456", 0.0);
		Conta contaDestino = new Conta("456548", 100.00);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		Assertions.assertThrows(IllegalArgumentException.class, () ->
				transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1.0));
		
	}
	
	@Test
	void validaCenarioDeExcecao() {
		Conta contaOrigem = new Conta("123456", 0.0);
		Conta contaDestino = new Conta("456548", 100.00);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		Assertions.assertDoesNotThrow(() ->	transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1.0));
		//verifica se não vai ser lançado uma exception nesse caso.
	}

}
