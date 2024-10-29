package br.com.fiap.fabricaVeiculos;

public class Caminhao {
	private String marca;
	private String modelo;
	private String cor;
	private String anoModelo;
	private String tipoMotor; // criei
	private boolean motor = false;
	private String tipoCambio;
	private String aroDasRodas;
	private int eixos;//
	private double quantidadeCargaAbastecida = 0; // coisa nova
	private double quantidadeCargaSuportada = 20; // coisa nova
	private String tipoCarga; // coisa nova
	private int velocidade = 0;
	private String nomeCondutor;
	private int renavam;
	private int limiteCarro = 380;

	// setters:

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public void setTipoMotor(String TipoMotor) {
		this.tipoMotor = tipoMotor;
	}

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

	// Metodos do carro
	// ------------------------------------------------------------------

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

	public void abasteceCaminhao(int carga) {
		if (this.quantidadeCargaAbastecida + carga < this.quantidadeCargaSuportada) {
			this.quantidadeCargaAbastecida += carga;
		} else if (this.quantidadeCargaAbastecida + carga > this.quantidadeCargaSuportada) {
			this.quantidadeCargaAbastecida = this.quantidadeCargaSuportada;
		}
	}

	// metodo exibir dados do carro
	public void exibeCarro() {
		System.out.println("Condutor: " + nomeCondutor);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano modelo: " + anoModelo);
		System.out.println("Cor do carro: " + cor);
		System.out.println("Tipo de cambio: " + tipoCambio);
		System.out.println("Aro das rodas: " + aroDasRodas);
		System.out.println("Quantidade de eixos: " + eixos);
		System.out.println("Tipo de carga: " + tipoCarga);
		System.out.println("Carga na cacanba em toneladas: " + quantidadeCargaAbastecida);
		System.out.println("Estado do carro: " + motor);
		System.out.println("Velocidade do carro: " + velocidade);

	}

	public void desasbasteceCaminhao(double valor) {
		if (this.quantidadeCargaAbastecida > 0) {
			this.quantidadeCargaAbastecida -= valor;
			if (valor > this.quantidadeCargaSuportada) {
				this.quantidadeCargaAbastecida = this.quantidadeCargaSuportada;
			}
		}
	}

	// regras: para acelerar o carro este deve estar ligado
	// e para desligar este deve estar parado

}
