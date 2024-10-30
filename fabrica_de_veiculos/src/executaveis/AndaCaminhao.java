package executaveis;

import br.com.fiap.modelos.Caminhao;

public class AndaCaminhao {

	public static void main(String[] args) {
		Caminhao meuCaminhao = new Caminhao();

		meuCaminhao.setTipoCarga("capivarias"); // Exemplo de tipo de carga
		meuCaminhao.setTipoMotor("Diesel"); // Exemplo de tipo de motor
		meuCaminhao.setRenavam(987654321); // Número fictício do RENAVAM
		meuCaminhao.setMarca("Mercedes-Benz"); // Marca do caminhão
		meuCaminhao.setModelo("Actros 2546"); // Modelo do caminhão
		meuCaminhao.setCor("Branco"); // Cor do caminhão
		meuCaminhao.setAnoModelo("2022"); // Ano do modelo
		meuCaminhao.setTipoCambio("Automatico"); // Tipo de câmbio
		meuCaminhao.setAro("22 polegadas"); // Aro das rodas
		meuCaminhao.setCondutor("Thiago"); // Nome do condutor
		meuCaminhao.setEixos(3);
		meuCaminhao.abasteceCaminhao(10);
		meuCaminhao.abasteceCaminhao(100);
		meuCaminhao.desasbasteceCaminhao(100);

		meuCaminhao.ligaCarro();
		meuCaminhao.aceleraCarro(130);
		meuCaminhao.exibeCarro();
		
	

	}

}
