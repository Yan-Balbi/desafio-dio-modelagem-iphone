package edu.yan.modelagemiphone;

import java.util.List;
import java.util.Map;

import edu.yan.modelagemiphone.Models.UsuarioEmail;

public interface IGerenciadorDeEmail {
	public Map<UsuarioEmail, String> listarEmailsRecebidos();
	
	public void abrirEmail(int emailId);
	
	public void enviarEmail(UsuarioEmail remetente, String mensagem, List<UsuarioEmail> destinatario);
	
	public void receberEmail(UsuarioEmail remetente, String mensagem);
}
