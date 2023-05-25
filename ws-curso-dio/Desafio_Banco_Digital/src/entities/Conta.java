package entities;

public abstract class Conta extends Banco implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	private Cliente nomeCliente;
	private boolean statusConta = false;
	private Gerente gerenteConta;

	public Conta(Cliente nomeCliente, Gerente gerenteConta) {
		agencia = Conta.AGENCIA_PADRAO;
		numeroConta = SEQUENCIAL++;
		this.nomeCliente = nomeCliente;
		this.gerenteConta = gerenteConta;
	}

	@Override
	public void sacar(double valor) {
		if (!statusConta) {
			System.out.println("Conta inexistente. Por favor, crie a conta para poder fazer o saque!");
		} else {
			if (saldo > valor) {
				this.saldo -= valor;
				System.out.println("Saque feito com sucesso!");
			} else {
				System.out.println("Impossível sacar, saldo insuficiente!");
			}
		}

	}

	@Override
	public void depositar(double valor) {
		if (!statusConta) {
			System.out.println("Conta inexistente. Por favor, crie a conta para poder fazer o depósito!");
		} else {
			this.saldo += valor;
			System.out.println("Depósito efetuado com sucesso!");
		}
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (!statusConta) {
			System.out.println("Conta inexistente. Por favor, crie a conta para poder fazer a transferência!");
		} else if (!contaDestino.statusConta) {
			System.out.println("Conta destino inexistente!");
		} else {
			if (valor < saldo) {
				this.sacar(valor);
				contaDestino.depositar(valor);
				System.out.println("Transferência efetuada com sucesso!");
			} else {
				System.out.println("Não foi possível transferir. Saldo insuficiente!");
			}
		}
	}

	public void abrirConta() {
		if (!statusConta) {
			statusConta = true;
			System.out.println("Conta aberta com sucesso!");
		} else {
			System.out.println("Não foi possível criar a conta, pois, ela já existe!");
		}
	}

	public void fecharConta() {
		if (statusConta) {
			statusConta = false;
			System.out.println("Conta fechada com sucesso!");
		} else {
			System.out.println("Não foi possível fechar a conta, pois, ela não existe!");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getNomeCliente() {
		return nomeCliente;
	}

	public boolean getStatusConta() {
		return statusConta;
	}
	public Gerente getGerenteConta() {
		return gerenteConta;
	}
}
