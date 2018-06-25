package br.com.program.model.factory;

import java.util.List;

import br.com.program.model.classes.Question;
import br.com.program.model.classes.Theme;
import br.com.program.model.manager.Manager;

public class QuestionsFactory {
	public static QuestionsFactory getQuestoesFactory() {
		return new QuestionsFactory();
	}
	
	public List<Question> retornaQuestoes(Theme theme){
		Manager manager = Manager.GetInstance();
		List<Question> questoes;
		List<Question> questoes2;
		questoes = 	theme.getQuestoes();
		questoes2 = manager.getQuestoesDao().BuscarTodos();
		for(Question question : questoes2) {
			if (question.getTheme() == null)
				questoes.add(question);
		}
		return questoes;
	}
}
