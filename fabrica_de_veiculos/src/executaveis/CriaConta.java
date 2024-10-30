package executaveis;
import br.com.fiap.modelos.Conta;
import br.com.fiap.modelos.Cliente;


public class CriaConta {

	public static void main(String[] args) {
		Cliente clienteThiago = new Cliente("Thiago", "44363342752", "Rua dos palmares", "12/01/2005");
		Conta minhaConta = new Conta(1232949821L, clienteThiago);
		minhaConta.depositar(928);
		minhaConta.exibirSaldo();
		
		

	}

}
