package br.com.fiap.fabricaVeiculos;

public class Conta {
	private String nomeCliente;
	private String cpfCliente;
	private long numeroConta;
	private double saldo;
	
	
	public Conta(String nomeCliente, String cpfCliente, long numeroConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
	}

	// METODOS//----------------------------------------------------------------------

	// SACAR//---------------------------------------------------------------------
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque realizado");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
	// -------------------------------------------------------------------------------

	// DEPOSITAR//--------------------------------------------------------------------

	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Deposito realizado com sucesso");
	}
	// --------------------------------------------------------------------------------

	// TRANSFERIR//--------------------------------------------------------------------
	public void transferir(Conta conta, double valor) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}

	}
	// -----------------------------------------------------------------------------

	// EXIBIR
	// SALDO//------------------------------------------------------------------
	public void exibirSaldo() {
		System.out.println("CPF: " + this.cpfCliente);
		System.out.println("Numero de conta: " + this.numeroConta);
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
	}

}
