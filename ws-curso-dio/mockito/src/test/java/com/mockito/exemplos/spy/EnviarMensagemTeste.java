package com.mockito.exemplos.spy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnviarMensagemTeste {

	@Spy
	private EnviarMensagem enviarMensagem;
	
	@Test
	void verificarComportamentoDaClasse() {
		Mockito.verifyNoInteractions(enviarMensagem); // mockito verifica se não houve interação com "enviar mensagem"
		
		Mensagem mensagem = new Mensagem("Hello World!");
		enviarMensagem.adicionarMensagem(mensagem);
		
		Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);// mockito verifica se "enviar mensagem" teve "adicionar mensagem" com o parametro "mensagem"
	
		Assertions.assertFalse(enviarMensagem.getMensagem().isEmpty());
	
	}
}
