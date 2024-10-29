package executaveis;
import br.com.fiap.fabricaVeiculos.Conta;

public class CriaConta {

	public static void main(String[] args) {
		Conta minhaConta = new Conta("Pedro", "222333444555", 128732983031921L);
		
		minhaConta.exibirSaldo();

	}

}
