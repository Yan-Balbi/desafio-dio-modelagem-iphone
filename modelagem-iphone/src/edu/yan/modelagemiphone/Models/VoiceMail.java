package edu.yan.modelagemiphone.Models;

public class VoiceMail {
	private String remetente;
	
	private Contato destinatario;
	
	private double duracao;
	
	public VoiceMail(String remetente, Contato destinatario, double duracao) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.duracao = duracao;
	}

	public Contato getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Contato destinatario) {
		this.destinatario = destinatario;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetenteString) {
		this.remetente = remetenteString;
	}
	
}
