package edu.yan.modelagemiphone.Models;

public class UsuarioEmail {
	private String nome;
	private String email;
	
	public UsuarioEmail(String nome, String email) {
		this.nome = nome;
		this.setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
