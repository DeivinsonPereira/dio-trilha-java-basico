package celular;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {

	@Override
	public void tocar() {
		System.out.println("TOCAR MÚSICA");
	}
	
	@Override
	public void pausar() {
		System.out.println("PARAR MÚSICA");
	}
	
	@Override
	public void selecionarMusica(int faixa) {
		System.out.println("REPRODUZINDO FAIXA : " + faixa);
	}
	
	@Override
	public void ligar(long numero) {
		System.out.println("LIGANDO PARA O NÚMERO DISCADO");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO A PÁGINA DESEJADA");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
	}


	
}
