package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

	public void imprimirDados() {
		
		for (Conta conta : contas) {
			if(!conta.getStatusConta()) {
				System.out.println("Conta Inexistente ou fechada recentemente!");
			} else {
				conta.ExtratoConta();
				System.out.println("Gerente da Conta: " + conta.getGerenteConta().getNome() + " // Idade: " + conta.getGerenteConta().getIdade());
				System.out.println("Titular: " + conta.getNomeCliente().getNome());
				System.out.println("Agencia: " + conta.getAgencia());
				System.out.println("Número da Conta: " + conta.getNumeroConta());
				System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
			}
		}
	}

	public List<Conta> getContas() {
		return contas;
	}

}
