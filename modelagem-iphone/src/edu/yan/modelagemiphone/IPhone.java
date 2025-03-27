package edu.yan.modelagemiphone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import edu.yan.modelagemiphone.Models.Contato;
import edu.yan.modelagemiphone.Models.Foto;
import edu.yan.modelagemiphone.Models.Musica;
import edu.yan.modelagemiphone.Models.UsuarioEmail;
import edu.yan.modelagemiphone.Models.Video;
import edu.yan.modelagemiphone.Models.VoiceMail;

public class IPhone implements IReprodutorDeVideo, IReprodutorMusical, ITelefone, ICamera, ICalendario, INavegador, IGps{
	private List<Video> galeriaDeVideos = new ArrayList<>();
	private List<Musica> playlist = new ArrayList<>();
	
	private List<Contato> contatos = new ArrayList<>();
	private List<Contato> contatosFavoritos = new ArrayList<>();
	private List<VoiceMail> voiceMails = new ArrayList<>();
	private Map<String, Contato> mensagens;
	
	
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
		galeriaDeVideos.add(video);
	}

	@Override
	public List<Video> listarVideo() {
		// TODO Auto-generated method stub
		return galeriaDeVideos;
	}

	@Override
	public void reproduzirVideo(Video video) {
		for(Video v: galeriaDeVideos) {
			if(v.getNomeVideo() == video.getNomeVideo())
				System.out.println("Reproduzindo vídeo "+video);
			else
				System.out.println("Nenhum video econtrado");
		}
		
	}
	
	//REPRODUTOR  MUSICAL
	
	@Override
	public void adicionarMusica(Musica musica) {
		// TODO Auto-generated method stub
		playlist.add(musica);
	}

	@Override
	public List<Musica> listarMusicas() {
		// TODO Auto-generated method stub
		return playlist;
	}

	@Override
	public void reproduzirMusica(Musica musica) {
		// TODO Auto-generated method stub
		System.out.println("Reproduzindo "+musica.getNomeMusica()+" de "+musica.getArtista());
	}
	
	// TELEFONE
	@Override
	public void adicionarContato(Contato contato) {
		// TODO Auto-generated method stub
		if(!verificarExistenciaDeContado(contato))
			contatos.add(contato);
		else
			System.out.println("Contato já cadastrado");
	}
	
	private boolean verificarExistenciaDeContado(Contato contato) {
		boolean contatoExistente = false;
		for(Contato c: contatos) {
			if(c.getNome().equals(contato.getNome()) && (c.getNumero().equals(contato.getNumero()))) {
				contatoExistente = true;
				return contatoExistente;
			}
		}
		return contatoExistente;
	}

	@Override
	public void atenderChamada(boolean atender) {
		// TODO Auto-generated method stub
		if(atender) {
			System.out.println("Atendendo chamada");
		} else {
			System.out.println("Recusando chamada");
		}
	}

	@Override
	public void adicionarAListaDeContatosFavoritos(Contato contato) {
		// TODO Auto-generated method stub
		if(verificarExistenciaDeContado(contato) && !verificarExistenciaDeContadoFavorito(contato)) {
			contatosFavoritos.add(contato);
		}
	}
	
	private boolean verificarExistenciaDeContadoFavorito(Contato contatoFavorito) {
		boolean contatoExistente = false;
		for(Contato c: contatosFavoritos) {
			if(c.getNome().equals(contatoFavorito.getNome()) && (c.getNumero().equals(contatoFavorito.getNumero()))) {
				contatoExistente = true;
				return contatoExistente;
			}
		}
		return contatoExistente;
	}

	@Override
	public void ligarParaNumero(int numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para: "+numero);
	}

	@Override
	public void enviarVoiceMails(VoiceMail voiceMail) {
		// TODO Auto-generated method stub
		System.out.println("Enviando voiceMail ["+voiceMail+"] de "+voiceMail.getDuracao()+" minutos para"+voiceMail.getDestinatario());
	}

	@Override
	public List<VoiceMail> listarVoiceMailRecebidos() {
		// TODO Auto-generated method stub
		return voiceMails;
	}

	@Override
	public void ouvirVoiceMailRecebido(int voiceMailId) {
		// TODO Auto-generated method stub
		System.out.println("Ouvindo voicemail de "+voiceMails.get(voiceMailId).getRemetente());
	}

	@Override
	public void receberVoiceMail(VoiceMail voiceMail) {
		System.out.println("Você reecbeu um novo voicemail de "+voiceMail.getRemetente());
		voiceMails.add(voiceMail);
		System.out.println(voiceMail.getRemetente()+" enviou uma mensagem.");
	}

	@Override
	public void enviarSMS(Contato contato, String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando MSM  para "+contato.getNome());
	}

	@Override
	public Map<String, Contato> listarMSMsRecebidos() {
		// TODO Auto-generated method stub
		return mensagens;
	}

	@Override
	public void lerMSMRecebido(int smsId) {
		// TODO Auto-generated method stub
		System.out.println("Abrindo mensagem");
	}

	@Override
	public void receberSMS(String mensagem, Contato contato) {
		// TODO Auto-generated method stub
		mensagens.put(mensagem, contato);
		System.out.println(contato.getNome()+" enviou uma mensagem.");
	}
	
	//CAMERA
	
	@Override
	public void tirarFoto() {
		// TODO Auto-generated method stub
		System.out.println("tirando foto.");
	}

	@Override
	public void exibirTodasAsFotos() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo todas as fotos");;
	}

	@Override
	public void exibirFoto(int fotoId) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo foto de id "+fotoId);
	}
	
	//CALENDARIO
	
	@Override
	public void exibirCalendario() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo calendario");
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
		System.out.println("Abrindo pagina de url"+url);
	}

	@Override
	public void abrirNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo nova aba");
	}

	@Override
	public void fecharPagina() {
		// TODO Auto-generated method stub
		System.out.println("Fechando nova aba");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando pagina");
	}
	
	//GPS
	
	
	@Override
	public void exibirMapa() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo mapa no GPS.");
	}

	@Override
	public void ampliarZoomMapa() {
		// TODO Auto-generated method stub
		System.out.println("Ampliando zoom");
	}
	
	@Override
	public void reduzirZoomMapa() {
		// TODO Auto-generated method stub
		System.out.println("Reduzindo zoom");
	}

	@Override
	public void marcarPontoDestinoMapa(int altitude, int latitude) {
		// TODO Auto-generated method stub
		System.out.println("Marcando ponto nas coordenasdas ["+altitude+","+latitude+"]");
	}

	@Override
	public void buscarLocalNoMapa(String nomeLocal) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por: "+nomeLocal);
	}	
}
