package br.com.program.model.classes;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private String name;
	private Theme theme;
	private List<Home> home;  
	private List<Question> questoes;
	private List<Perfil> perfis;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Theme getTema() {
		return theme;
	}

	public void setTema(Theme theme) {
		this.theme = theme;
	}

	
	public List<Home> getCasa() {
		if(home == null) 
			home = new ArrayList<Home>();
		return home;
	}

	public void setCasa(List<Home> home) {
		this.home = home;
	}
	

	public List<Question> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Question> questoes) {
		this.questoes = questoes;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}




	
	
	
}
