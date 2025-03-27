package edu.yan.modelagemiphone.Models;

public class Contato {
	
	private String nome;
	
	private int numero;
	
	public Contato(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
