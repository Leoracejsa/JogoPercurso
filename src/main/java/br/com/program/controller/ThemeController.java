package br.com.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.program.dto.ThemeDto;
import br.com.program.model.classes.Theme;
import br.com.program.service.ThemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Theme API")
@RestController
@RequestMapping(value="/program/theme")
@CrossOrigin("*")
public class ThemeController {
	@Autowired
	private ThemeService themeservice;

	@ApiOperation(value="Tracking themes for the game")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity CadastrarTheme(@RequestBody ThemeDto themeDto) {
						
		Theme theme = AtribuirTema(themeDto);
		if(themeservice.salvaTheme(theme)) 
			return new ResponseEntity(HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
				
	}
	
	@ApiOperation(value="Returning the game themes")
	@RequestMapping(method=RequestMethod.GET, value="/themes", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Theme>> RetornaThemes(){
		List<Theme> themes = themeservice.retornaThemes();
		return new ResponseEntity<List<Theme>>(themes, HttpStatus.OK);
	}

	private Theme AtribuirTema(ThemeDto themeDto) {
		Theme theme = new Theme();
		theme.setName(themeDto.getName());
		return theme;
	}
}
