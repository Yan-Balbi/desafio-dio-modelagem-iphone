package edu.yan.modelagemiphone;

import java.util.List;

import edu.yan.modelagemiphone.Models.Contato;
import edu.yan.modelagemiphone.Models.VoiceMail;

public interface ITelefone {
//	agenda telefonica
	public void adicionarContato(Contato contato);
	
	public void atenderChamada(boolean atender);
	
	public void adicionarAListaDeContatosFavoritos(Contato contato);
	
	public void ligarParaNumero(int numero);
	
//	voicemails
	public void enviarVoiceMails(VoiceMail voiceMail);
	
	public List<VoiceMail> listarVoiceMailRecebidos();
	
	public void ouvirVoiceMailRecebido(int voiceMailId);
	
	public void receberVoiceMail(VoiceMail voiceMail);
	
//	sms
	public void enviarSMS(Contato contato, String mensagem);
	
	public List<String> listarMSMsRecebidos();
	
	public void lerMSMRecebido(int smsId);
	
	public void receberSMS(String mensagem);
}
