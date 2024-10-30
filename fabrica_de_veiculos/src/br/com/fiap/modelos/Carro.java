package br.com.fiap.modelos;

public class Carro {
	private String marca; // criar
	private String modelo; // criar
	private String cor; // criar
	private String anoModelo; // criar
	private boolean motor = false;
	private String tipoCambio; // criar
	private String aroDasRodas; // criar
	private int velocidade = 0;
	private String nomeCondutor; // criar
	private int renavam;
	private int limiteCarro = 380;

	// setters:

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public void setAro(String aroDasRodas) {
		this.aroDasRodas = aroDasRodas;
	}

	public void setCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	// Metodos do carro ------------------------------------------------------------------
	
	
	

	// metodo ligar

	public void ligaCarro() {
		motor = true;
	}

	// metodo desligar

	public void desligaCarro() {
		if (!this.motor) {
			motor = false;
		}
	}

	// metodo acelerar

	public void aceleraCarro(int velocidade) {
		if (this.motor) {
			this.velocidade = velocidade;
			if (this.velocidade >= this.limiteCarro) {
				this.velocidade = limiteCarro;
			}
		} else {
			System.out.println("O carro esta desligado");
		}
	}

	// metodo frear
	public void freiaCarro(int velociade) {
		if (this.motor && this.velocidade > 0) {
			this.velocidade -= velocidade;
		}
	}

	// metodo exibir dados do carro
	public void exibeCarro() {
		System.out.println("Condutor: " + nomeCondutor);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano modelo: " + anoModelo);
		System.out.println("Cor do carro: " + cor);
		System.out.println("Tipo de cambio: " + anoModelo);
		System.out.println("Aro das rodas: " + aroDasRodas);
		System.out.println("Estado do carro: " + motor);
		System.out.println("Velocidade do carro:" + velocidade);

	}

	// regras: para acelerar o carro este deve estar ligado
	// e para desligar este deve estar parado

}
