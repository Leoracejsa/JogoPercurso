package br.com.program.service;

import java.util.List;

import br.com.program.model.builder.GameBuilder;
import br.com.program.model.classes.Game;
import br.com.program.model.classes.Home;
import br.com.program.model.classes.ParameterGame;
import br.com.program.model.classes.Perfil;
import br.com.program.model.classes.Question;
import br.com.program.model.classes.Theme;
import br.com.program.model.factory.ListHomesFactory;
import br.com.program.model.factory.QuestionsFactory;
import br.com.program.model.factory.UserFactory;
import br.com.program.model.manager.Manager;

public class GameService {
	
	public Game geraJogo(ParameterGame parametros) {
		Manager manager = Manager.GetInstance();
		Integer QuantityHouses = parametros.getQuantityHouses();
		Integer QuantityPlayer = parametros.getQuantityPlayers();
		Theme theme = (Theme) manager.getThemeDao().buscar(parametros.getTheme());
		if (theme == null) 
			theme = new Theme();
		UserFactory af = UserFactory.getPerfilFactory();
		ListHomesFactory cf = ListHomesFactory.getListaCasasFactory(manager.GetConfiguracoesGerais().getPostsLastHome(), QuantityHouses);
		QuestionsFactory qf = QuestionsFactory.getQuestoesFactory();
		List<Perfil> perfilList;
		List<Home> homes =  cf.getListaCasas(3, 2, 2);
		List<Question> questoes = qf.retornaQuestoes(theme);
		perfilList =  af.getListaPerfil(manager.GetConfiguracoesGerais().getColorsPerfil(), QuantityPlayer);
		GameBuilder jb = new GameBuilder();
		Game game = jb.homes(homes)
								.name(parametros.getName())
								.perguntas(questoes)
								.theme(theme)
								.perfis(perfilList)
								.build();
		return game;

	}

}
