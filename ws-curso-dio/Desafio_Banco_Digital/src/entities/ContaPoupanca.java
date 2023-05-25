package entities;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(Cliente nomeCliente, Gerente gerenteConta) {
		super(nomeCliente, gerenteConta);
	}

	@Override
	public void ExtratoConta() {
		System.out.println("### EXTRATO CONTA POUPANÇA ###\n");
		super.imprimirDados();
	}

	
}
