package br.com.program.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.program.model.classes.Game;
import br.com.program.model.classes.GeneralSettings;
import br.com.program.model.classes.ParameterGame;
import br.com.program.model.listed.Color;
import br.com.program.model.manager.Manager;
import br.com.program.service.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Access from API")
@RestController
@RequestMapping(value="/program/game")
@CrossOrigin("*")
public class GameController {

	@ApiOperation(value="Creates the parameters of the Game")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornarJogo(@RequestBody ParameterGame parameters) {
		Manager manager = Manager.GetInstance();
		Game game = jogoAleatorio(parameters);
		Map<Integer, Object> retorno = new HashMap<Integer, Object>();
		retorno.put(0, game);
		retorno.put(1, manager.GetConfiguracoesGerais());
		return new ResponseEntity<Map<Integer, Object>>(retorno,HttpStatus.OK );
	}

	private GeneralSettings config() {
		GeneralSettings conf = new GeneralSettings();
		for(Color color : Color.values()) {
			conf.getColorsPerfil().add(color);
			conf.setCoresTabuleiro(color);
			conf.getPostsLastHome().add(String.valueOf(color.getValor()));
		}
		return conf;
		
	}
	private Game jogoAleatorio(ParameterGame parameters) {
		GameService gameService = new GameService();
		
		Game game =gameService.geraJogo(parameters); 
				return game;
	}	
}
