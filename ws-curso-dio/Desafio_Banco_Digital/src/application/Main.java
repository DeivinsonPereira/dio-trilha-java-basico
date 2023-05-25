package application;

import java.util.Locale;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Conta cc = new ContaCorrente(new Cliente("Deivinson"), new Gerente("Anderson", 32));
		Conta cp = new ContaPoupanca(new Cliente("Gabi"), new Gerente ("Andreia", 47));
		
		cp.abrirConta();
		cc.abrirConta();
		
		cp.depositar(200.00);
		cc.depositar(100.00);
		
		cp.fecharConta();
		cp.depositar(100);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
		Banco Conta01 = new Banco();
		Conta01.adicionarConta(cp);
		Banco Conta02 = new Banco();
		Conta02.adicionarConta(cc);
		
		cp.abrirConta();
		Conta01.imprimirDados();
		System.out.println();
		Conta02.imprimirDados();
		
		
		
	}
}
