package br.com.program.model.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.program.model.listed.Color;

public class GeneralSettings {
	private Color corTabuleiro;
	private List<String> postsLastHome;
	private List<Color> colorsPerfil;
	
	public Color getCorTabuleiro() {
		return corTabuleiro;
	}
	public void setCoresTabuleiro(Color corTabuleiro) {

		this.corTabuleiro = corTabuleiro;
	}
	public List<String> getPostsLastHome() {
		if (postsLastHome == null)
			postsLastHome = new ArrayList<String>();
		return postsLastHome;
	}
	public void setPostsLastHome(List<String> postsLastHome) {
	
		this.postsLastHome = postsLastHome;
	}
	public List<Color> getColorsPerfil() {
		if (colorsPerfil == null)
			colorsPerfil = new ArrayList<Color>();
		return colorsPerfil;
	}
	public void setColorsPerfil(List<Color> colorsPerfil) {
		this.colorsPerfil = colorsPerfil;
	}
	
	
	
	
	

}
