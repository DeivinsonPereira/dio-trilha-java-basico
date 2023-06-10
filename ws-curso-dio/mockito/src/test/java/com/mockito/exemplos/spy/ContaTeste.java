package com.mockito.exemplos.spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContaTeste {

	@Spy
	private Conta conta = new Conta(1000.00);
	
	
	@Test
	void validarOrdemDeChamadas() {
		
		conta.pagaboleto(300.00);
		
		InOrder inOrder = Mockito.inOrder(conta);
		inOrder.verify(conta).pagaboleto(300);// ArgumentMatchers.anyDouble() verifica se passou com qualquer valor
		inOrder.verify(conta).validaSaldo(300);
		inOrder.verify(conta).debita(300);
		inOrder.verify(conta).enviaCreditoParaEmissor(300);
	}

	@Test
	void validarQuantidadeDeChamadas() {
		
		conta.validaSaldo(300);
		conta.validaSaldo(500);
		conta.validaSaldo(600);
		
		Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyDouble());
	}
}
