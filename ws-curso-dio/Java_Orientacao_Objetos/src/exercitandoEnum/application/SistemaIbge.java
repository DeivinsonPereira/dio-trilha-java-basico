package exercitandoEnum.application;

import exercitandoEnum.Enum.EstadoBrasileiro;

public class SistemaIbge {

	public static void main(String[] args) {

		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
		}
		
		EstadoBrasileiro piaui = EstadoBrasileiro.SANTA_CATARINA;
		
		System.out.println(piaui.getNome());
		System.out.println(piaui.getSigla());
		System.out.println(piaui.getNomeMaiusculo());
		System.out.println(piaui.getCodigoIbge());
	}

}
