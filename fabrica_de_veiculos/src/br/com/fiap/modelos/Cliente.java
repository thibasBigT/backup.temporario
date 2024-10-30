package br.com.fiap.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	public String nome;
	private String cpf;
	private String end;
	private Date dataNasc = new Date();

	// Construtor
	public Cliente(String nome, String cpf, String end, String dataNasc) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			this.dataNasc = format.parse(dataNasc);
		} catch (ParseException e) {
			System.err.println("Formato de data inválido: " + dataNasc);
			e.printStackTrace();
		}
	}

	// getters / setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
