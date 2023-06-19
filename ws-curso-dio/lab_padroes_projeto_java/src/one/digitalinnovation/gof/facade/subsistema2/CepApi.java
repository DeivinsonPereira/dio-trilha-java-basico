package one.digitalinnovation.gof.facade.subsistema2;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
