package exercitandoEnum.Enum;

public enum EstadoBrasileiro {

	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI ("PI", "Piauí", 13),
	MARANHAO ("MA", "Maranhão", 14),
	CEARA("CE", "Ceará" , 15),
	SANTA_CATARINA ("SC", "Santa Catarina", 16)
	
	
	;
	
	private int codigoIbge;
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
		this.nome = nome;
		this.sigla = sigla;
		this.codigoIbge = codigoIbge;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoIbge() {
		return codigoIbge;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
