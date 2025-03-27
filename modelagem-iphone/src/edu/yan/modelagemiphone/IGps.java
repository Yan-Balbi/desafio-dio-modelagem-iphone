package edu.yan.modelagemiphone;

public interface IGps {
	
	public void exibirMapa();
	
	public void ampliarZoomMapa();
	
	public void reduzirZoomMapa();
	
	public void marcarPontoDestinoMapa(int altitude, int latitude);
	
	public void buscarLocalNoMapa(String nomeLocal);
	
}
