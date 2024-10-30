package executaveis;
import br.com.fiap.modelos.Carro;

public class AndaNoCarro {

	public static void main(String[] args) {
		boolean dentroCarro = true;
		Carro meuCarro = new Carro();
		
		meuCarro.setAnoModelo("2009");
		meuCarro.setAro("20 polegadas");
		meuCarro.setCondutor("Thiago");
		meuCarro.setCor("Azul do Braia");
		meuCarro.setMarca("Nissan");
		meuCarro.setModelo("Skyline GTR R35");
		meuCarro.setRenavam(123456789);
		meuCarro.setTipoCambio("Automatico");
		
		meuCarro.ligaCarro();
		meuCarro.aceleraCarro(500);
	
		
		meuCarro.exibeCarro();
		
		
		
	}

}
