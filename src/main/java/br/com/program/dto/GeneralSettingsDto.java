package br.com.program.dto;

import java.util.List;

public class GeneralSettingsDto {

	private Integer colorsTab;
	private List<String> postsLastHome;
	private List<Integer> colorsPerfil;
	
	public Integer getColorsTab() {
		return colorsTab;
	}
	public void setColorsTab(Integer colorsTab) {
		this.colorsTab = colorsTab;
	}
	public List<String> getPostsLastHome() {
		return postsLastHome;
	}
	public void setPostsLastHome(List<String> postsLastHome) {
		this.postsLastHome = postsLastHome;
	}
	public List<Integer> getColorsPerfil() {
		return colorsPerfil;
	}
	public void setColorsPerfil(List<Integer> colorsPerfil) {
		this.colorsPerfil = colorsPerfil;
	}
	
	
}
