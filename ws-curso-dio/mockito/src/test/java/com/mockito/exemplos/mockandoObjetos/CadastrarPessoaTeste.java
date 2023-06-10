package com.mockito.exemplos.mockandoObjetos;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CadastrarPessoaTeste {

	@Mock
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;
	
	@Test
	void validarDadosDeCadastro() {
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("Minas Gerais", "Patos de Minas", "Rua 2", "Apto", "Centro");
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("9999999999")).thenReturn(dadosLocalizacao);
		Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Deivinson", "46946164", LocalDate.now(), "9999999999");
		
		assertEquals("Deivinson", pessoa.getNome());
		assertEquals("46946164", pessoa.getDocumento() );
		assertEquals("Minas Gerais", pessoa.getEndereco().getUf());
		assertEquals("Apto", pessoa.getEndereco().getComplemento());
		
	}
	
	
	
}
