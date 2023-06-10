package com.mockito.exemplos.captor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServicoEnvioEmailTeste {

	@Mock
	private PlataformaDeEnvio plataforma;
	
	@InjectMocks
	private ServicoEnvioEmail servico;
	
	@Captor
	private ArgumentCaptor<Email> captor;
	
	@Test
	void validarDadosEnviadosParaAPlataforma() {
		
		String enderecoDeEmail = "usuario@teste.com.br";
		String mensagem = "Olá Mundo teste mensagem!";
		boolean ehFormatoHtml = true;
		
		servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);
		
		Mockito.verify(plataforma).enviarEmail(captor.capture());
		
		Email emailCapturado = captor.getValue();
		
		assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
		assertEquals(mensagem, emailCapturado.getMensagem());
		assertEquals(Formato.TEXTO, emailCapturado.getFormato());
				
	}
}
