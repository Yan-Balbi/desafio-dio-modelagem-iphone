package edu.yan.modelagemiphone;

import java.util.List;

import edu.yan.modelagemiphone.Models.UsuarioEmail;

public class Main {
	public static void main(String[] args) {
		GerenciadorDeEmailGmail gmail = new GerenciadorDeEmailGmail();
		IPhone iphone1 = new IPhone(gmail);
		
		List<UsuarioEmail> destinatarios = List.of(new UsuarioEmail("pedro", "pedrao123@gmail.com"), new UsuarioEmail("ana", "ana@gmail.com"));
		
		iphone1.enviarEmail(new UsuarioEmail("Jose", "ze@gmail.com"), "Pessoal, boa tarde.\n Segue em anexo o relatório solicitado. \nGrato, Jose.", destinatarios);
	}
}
