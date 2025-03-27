package edu.yan.modelagemiphone.Models;

public class Video {
	private String nomeVideo;
	private double duracao;
	
	public Video(String nomeVideo, double duracao) {
		this.nomeVideo = nomeVideo;
		this.duracao = duracao;
	}

	public String getNomeVideo() {
		return nomeVideo;
	}

	public void setNomeVideo(String nomeVideo) {
		this.nomeVideo = nomeVideo;
	}
	
}
