package edu.yan.modelagemiphone;

import java.util.List;

import edu.yan.modelagemiphone.Models.Video;

public interface IReprodutorDeVideo {
	public void adicionarVideo(Video video);
	
	public List<Video> listarVideo();
	
	public void reproduzirVideo(Video video);
}
