package edu.yan.modelagemiphone.Models;

public class Musica {
	private String nomeMusica;
	private double duracao;
	
	public Musica(String nomeMusica, double duracao) {
		this.setNomeMusica(nomeMusica);
		this.duracao = duracao;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	
	

}
