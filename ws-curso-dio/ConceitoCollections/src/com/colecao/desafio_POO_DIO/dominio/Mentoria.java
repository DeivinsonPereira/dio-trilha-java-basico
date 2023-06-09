package com.colecao.desafio_POO_DIO.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" +
				getTitulo() +
				", descricao=" +
				getDescricao() +
				", data=" + data + "]";
	}
	
	@Override
	protected double calcularXp() {
		return XP_PADRAO + 20.0;
	}
	
	
}
