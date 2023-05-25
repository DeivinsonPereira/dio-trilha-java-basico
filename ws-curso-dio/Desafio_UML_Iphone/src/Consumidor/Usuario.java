package Consumidor;

import celular.Iphone;

public class Usuario {

	public static void main(String[] args) {
		
		Iphone celular = new Iphone();
		
		System.out.println("REPRODUTOR MUSICAL");
		System.out.println();
		
		celular.tocar();
		celular.pausar();
		celular.selecionarMusica(6);
	
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		System.out.println("APARELHO TELEFONICO");
		System.out.println();
		
		celular.ligar(4899999999L);
		celular.atender();
		celular.iniciarCorreioVoz();
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		System.out.println("NAVEGADOR DE INTERNET");
		System.out.println();
		
		celular.exibirPagina();
		celular.adicionarNovaAba();
		celular.atualizarPagina();
		
		
	}
}
