package com.mockito.exemplos.mockandoObjetos;

public class ApiDosCorreios {

	private String cep;

	public ApiDosCorreios(String cep) {
		this.cep = cep;
	}

	public DadosLocalizacao buscaDadosComBaseNoCep(String cep) {
		if(cep.equals(this.cep)) {
			DadosLocalizacao dados = new DadosLocalizacao("Santa Catarina", "Florianópolis", "Anderson Luis Americo", "Casa", "Monte Videl");
			return dados;
		}
		return null;
	}
	
	public String getCep() {
		return cep;
	}
	
	
}
