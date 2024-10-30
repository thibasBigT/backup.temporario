package br.com.fiap.modelos;

public class Conta {
	private long numeroConta;
	private double saldo;
	private Cliente cliente;

	
	public Conta(long numeroConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
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
		System.out.println("Numero de conta: " + this.numeroConta);
		System.out.println("Nome do Cliente: " + this.cliente.nome);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data : " + this.cliente.getDataNasc());
	}

}
