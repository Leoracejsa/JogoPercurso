package br.com.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.program.dto.QuestionDto;
import br.com.program.model.classes.Question;
import br.com.program.model.listed.DifficultyLevel;
import br.com.program.model.manager.Manager;
import br.com.program.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="Asset API")
@RestController
@RequestMapping(value="/program/questions")
@CrossOrigin("*")
public class QuestionController {
	
	@Autowired
	private QuestionService questaoservice;

	@ApiOperation(value="Registration Issues")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity salvarQuestao(@RequestBody QuestionDto questionDto) {
		Question question = AtribuirQuestao(questionDto);
		if(questaoservice.salvarQuestao(question))
			return new ResponseEntity(HttpStatus.OK);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@ApiOperation(value="Returns the Difficulties")
	@RequestMapping(value="/difficulties", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornaDifficulties() {
		return new ResponseEntity(DifficultyLevel.values(), HttpStatus.OK);
	}

	private Question AtribuirQuestao(QuestionDto questionDto) {
		Question question = new Question();
		Manager manager = Manager.GetInstance();
		question.setDifficulty(DifficultyLevel.values()[questionDto.getDifficulty()]);
		question.setStatement(questionDto.getStatement());
		question.setOptions(questionDto.getOption());
		question.setTheme(manager.getThemeDao().buscar(questionDto.getTheme()));
		return question;
	}
}
