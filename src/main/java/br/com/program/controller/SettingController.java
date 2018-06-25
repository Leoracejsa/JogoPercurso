package br.com.program.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.program.dto.GeneralSettingsDto;
import br.com.program.model.classes.GeneralSettings;
import br.com.program.model.listed.Color;
import br.com.program.model.manager.Manager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API with Settings")
@RestController
@RequestMapping("/program/config")
@CrossOrigin("*")
public class SettingController {

	@ApiOperation(value="General registration settings")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity salvarConfiguracao(@RequestBody GeneralSettingsDto configDto){
		Manager manager = Manager.GetInstance();
		try {
			GeneralSettings config = atribuirConf(configDto);
			manager.atribuirConfiguracao(config);
			return new ResponseEntity(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@ApiOperation(value="Return of Colors")
	@RequestMapping(value="/color", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornaCores() {
		return new ResponseEntity(Color.values(), HttpStatus.OK);
	}

	private GeneralSettings atribuirConf(GeneralSettingsDto configDto) {
		GeneralSettings config = new GeneralSettings();
		List<Color> corestab = new ArrayList<Color>();
		List<Color> colorsPerfil = new ArrayList<Color>();
		for (Color color : Color.values()) {
			if (color.getValor() == configDto.getColorsTab()) {
				config.setCoresTabuleiro(color);
			}
			for(Integer ColorsPerfil : configDto.getColorsPerfil()) {
				if (ColorsPerfil == color.getValor())
					colorsPerfil.add(color);
			}
		}
		config.setColorsPerfil(colorsPerfil);
		config.setPostsLastHome(configDto.getPostsLastHome());
		return config;
	}	
	
}
