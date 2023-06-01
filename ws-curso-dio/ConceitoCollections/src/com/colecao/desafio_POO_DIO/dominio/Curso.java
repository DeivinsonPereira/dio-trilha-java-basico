package com.colecao.desafio_POO_DIO.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	


	public int getCarcaHoraria() {
		return cargaHoraria;
	}

	public void setCarcaHoraria(int carcaHoraria) {
		this.cargaHoraria = carcaHoraria;
	}


	@Override
	public String toString() {
		return "Curso [titulo=" + 
				getTitulo() + ", descricao=" 
				+ getDescricao() + 
				", carcaHoraria=" + 
				cargaHoraria + "]";
	}

	@Override
	protected double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	
	
	
	
	
}
