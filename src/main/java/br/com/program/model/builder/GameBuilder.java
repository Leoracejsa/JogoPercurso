package br.com.program.model.builder;

import java.util.List;

import br.com.program.model.classes.Game;
import br.com.program.model.classes.Home;
import br.com.program.model.classes.Perfil;
import br.com.program.model.classes.Question;
import br.com.program.model.classes.Theme;

public class GameBuilder implements GameInterfaceBuilder {
	private List<Home> homes;
	private List<Question> questoes;
	private String name;
	private Theme theme;
	private List<Perfil> perfis;

	@Override
	public GameInterfaceBuilder homes(List<Home> homes) {
		this.homes = homes;
		return this;
	}

	@Override
	public GameInterfaceBuilder perguntas(List<Question> questoes) {
		this.questoes = questoes;
		return this;
	}

	@Override
	public GameInterfaceBuilder name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public GameInterfaceBuilder theme(Theme theme) {
		this.theme = theme;
		return this;
	}

	@Override
	public Game build() {
		Game game = new Game();
		game.setCasa(this.homes);
		game.setName(this.name);
		game.setQuestoes(this.questoes);
		game.setTema(this.theme);
		game.setPerfis(this.perfis);
		return game;
	}

	@Override
	public GameInterfaceBuilder perfis(List<Perfil> perfis) {
		this.perfis = perfis;
		return this;
	}

}
