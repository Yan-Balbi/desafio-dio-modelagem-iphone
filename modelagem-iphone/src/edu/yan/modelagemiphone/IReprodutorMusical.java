package edu.yan.modelagemiphone;

import java.util.List;

import edu.yan.modelagemiphone.Models.Musica;

public interface IReprodutorMusical {
	
	public void adicionarMusica(Musica musica);
	
	public List<Musica> listarMusicas();
	
	public void reproduzirMusica(Musica musica);
}
