package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente nomeCliente, Gerente gerenteConta) {
		super(nomeCliente, gerenteConta);
	}

	public void Imprimir() {
		super.imprimirDados();
	}

	@Override
	public void ExtratoConta() {
		System.out.println("### EXTRATO CONTA CORRENTE ###\n");
		
	}
}
