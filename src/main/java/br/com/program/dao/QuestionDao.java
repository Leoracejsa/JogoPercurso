package br.com.program.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.program.model.classes.Question;
import br.com.program.model.classes.Theme;
import br.com.program.model.manager.Manager;

public class QuestionDao implements DaoGenerico<Question>{
	private List<Question> questoes;
	private Long id;
	private Manager manager;
	
	public QuestionDao() {
		questoes = new ArrayList<Question>();
		id = 0L;
		manager = Manager.GetInstance();
	}
	
	@Override
	public boolean salvar(Question question) {
		boolean saida;
		saida = false;
		Question quest = (Question) question;
		Theme theme;
		quest.setId(id++ + 1);
		if (question.getTheme() != null) {
			 theme = (Theme) manager.getThemeDao().buscar(quest.getTheme().getId());
			 theme.getQuestoes().add(quest);
			 manager.getThemeDao().Alterar(theme);
		}
		if ( !questoes.contains(quest)) {			
			questoes.add(quest);
			saida = true;
		}
		return saida;
	}
	
	public boolean remover(Question question) {
		boolean saida;
		saida = false;
		if ( questoes.contains(question)) {
			questoes.remove(question);
			saida = true;
		}
		return saida;
	}
	
	public boolean remover(Long id) {
		boolean saida;
		Question question = new Question();
		question.setId(id);
		saida = false;
		if (questoes.contains(question)) {
			questoes.remove(question);
			saida = true;
		}
		return saida;
	}
	
	public Question buscar(Long id) {
		for (Question question : questoes) {
			if (question.getId() == id)
				return question;
		}
		return null;
	}
	public List<Question> BuscarTodos(){
		return questoes;
	}

}
