package br.com.program.service;

import org.springframework.stereotype.Service;

import br.com.program.model.classes.Question;
import br.com.program.model.manager.Manager;

@Service
public class QuestionService {

	public boolean salvarQuestao(Question question) {
		Manager manager = Manager.GetInstance();
		return manager.getQuestoesDao().salvar(question);		
	}
}
