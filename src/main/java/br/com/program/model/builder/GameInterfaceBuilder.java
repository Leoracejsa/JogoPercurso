package br.com.program.model.builder;

import java.util.List;

import br.com.program.model.classes.Game;
import br.com.program.model.classes.Home;
import br.com.program.model.classes.Perfil;
import br.com.program.model.classes.Question;
import br.com.program.model.classes.Theme;

public interface GameInterfaceBuilder {
public GameInterfaceBuilder homes(List<Home> homes );
public GameInterfaceBuilder perguntas(List<Question> questoes);
public GameInterfaceBuilder name(String name);
public GameInterfaceBuilder theme(Theme theme);
public GameInterfaceBuilder perfis (List<Perfil> perfis);
public Game build();

}
