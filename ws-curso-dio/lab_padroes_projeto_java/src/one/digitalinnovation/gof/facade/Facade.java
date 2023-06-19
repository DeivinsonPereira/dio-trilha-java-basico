package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsistema.crm.CRMService;
import one.digitalinnovation.gof.facade.subsistema2.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado =	CepApi.getInstancia().recuperarEstado(cep);
		
		
		CRMService.gravarCliente(nome, cep, cidade, estado);
		
		
	}
}
