package edu.yan.modelagemiphone.Models;

public class Musica {
	private String artista;
	private String nomeMusica;
	private double duracao;
	
	public Musica(String artista, String nomeMusica, double duracao) {
		this.artista = artista;
		this.nomeMusica = nomeMusica;
		this.duracao = duracao;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	

}
