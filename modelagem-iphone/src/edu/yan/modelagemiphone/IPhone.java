package edu.yan.modelagemiphone;

import java.util.List;

import edu.yan.modelagemiphone.Models.Contato;
import edu.yan.modelagemiphone.Models.Foto;
import edu.yan.modelagemiphone.Models.Musica;
import edu.yan.modelagemiphone.Models.UsuarioEmail;
import edu.yan.modelagemiphone.Models.Video;
import edu.yan.modelagemiphone.Models.VoiceMail;

public class IPhone implements IReprodutorDeVideo, IReprodutorMusical, ITelefone, ICamera, ICalendario, INavegador, IGps{

	private IGerenciadorDeEmail gerenciadorDeEmail;
	
	public IPhone(){
		
	}
	public IPhone(IGerenciadorDeEmail gerenciadorDeEmail) {
		this.gerenciadorDeEmail = gerenciadorDeEmail;
	}
	
	public IGerenciadorDeEmail getGerenciadorDeEmail() {
		return gerenciadorDeEmail;
	}

	public void setGerenciadorDeEmail(IGerenciadorDeEmail gerenciadorDeEmail) {
		this.gerenciadorDeEmail = gerenciadorDeEmail;
	}
	
	//REPRODUTOR DE VIDEO
	
	@Override
	public void adicionarVideo(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Video> listarVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reproduzirVideo(Video video) {
		// TODO Auto-generated method stub
		
	}
	
	//REPRODUTOR  MUSICAL
	
	@Override
	public void adicionarMusica(Musica musica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Musica> listarMusicas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reproduzirMusica(Musica musica) {
		// TODO Auto-generated method stub
		
	}
	
	// TELEFONE
	@Override
	public void adicionarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atenderChamada(boolean atender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAListaDeContatosFavoritos(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarParaNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarVoiceMails(VoiceMail voiceMail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VoiceMail> listarVoiceMailRecebidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ouvirVoiceMailRecebido(int voiceMailId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberVoiceMail(VoiceMail voiceMail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarSMS(Contato contato, String mensagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> listarMSMsRecebidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lerMSMRecebido(int smsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberSMS(String mensagem) {
		// TODO Auto-generated method stub
		
	}
	
	//CAMERA
	
	@Override
	public void tirarFoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Foto> exibirTodasAsFotos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exibirFoto(int fotoId) {
		// TODO Auto-generated method stub
		
	}
	
	//CALENDARIO
	
	@Override
	public void exibirCalendario() {
		// TODO Auto-generated method stub
		
	}
	
	//GERENCIADOR DE EMAIL
	
	public void abrirEmail(int emailId) {
		this.gerenciadorDeEmail.abrirEmail(emailId);
	}
	
	public void enviarEmail(UsuarioEmail remetente, String mensagem, List<UsuarioEmail> destinatario) {
		this.gerenciadorDeEmail.enviarEmail(remetente, mensagem, destinatario);;
	}
	
	public void receberEmail(UsuarioEmail remetente, String mensagem) {
		this.gerenciadorDeEmail.receberEmail(remetente, mensagem);
	}
	
	//NAVEGADOR
	
	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}
	
	//GPS
	
	
	
	@Override
	public void exibirMapa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ampliarZoomMapa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marcarPontoDestinoMapa(int altitude, int latitude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarLocalNoMapa(String nomeLocal) {
		// TODO Auto-generated method stub
		
	}	
}
