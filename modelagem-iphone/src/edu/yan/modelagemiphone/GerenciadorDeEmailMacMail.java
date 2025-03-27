package edu.yan.modelagemiphone;

import java.util.List;
import java.util.Map;

import edu.yan.modelagemiphone.Models.UsuarioEmail;

public class GerenciadorDeEmailMacMail implements IGerenciadorDeEmail{
	Map<UsuarioEmail, String> emailsRecebidos;
	
	@Override
	public Map<UsuarioEmail, String> listarEmailsRecebidos() {
		// TODO Auto-generated method stub
		return emailsRecebidos;
	}

	@Override
	public void abrirEmail(int emailId) {
		System.out.println("Abrindo e-mail de id: "+emailId+" pelo MacMail");
	}

	@Override
	public void enviarEmail(UsuarioEmail remetente, String mensagem, List<UsuarioEmail> destinatario) {
		for (UsuarioEmail mailDestinatario : destinatario) {
			System.out.println("Enviando email de"+remetente+" para "+mailDestinatario.getNome()+" pelo MacMail. \n Conteúdo: "+mensagem);
		}
		
	}

	@Override
	public void receberEmail(UsuarioEmail remetente, String mensagem) {
		System.out.println("Recebendo email de "+remetente+" pelo macMail.\n mensagem: "+mensagem);
		emailsRecebidos.put(remetente, mensagem);
	}
}
