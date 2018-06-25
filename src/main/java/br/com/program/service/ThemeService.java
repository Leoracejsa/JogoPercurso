package br.com.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.program.model.classes.Theme;
import br.com.program.model.manager.Manager;

@Service
public class ThemeService {

	public boolean salvaTheme(Theme theme) {
		Manager manager = Manager.GetInstance();
		return manager.getThemeDao().salvar(theme);
	}
	
	public List<Theme> retornaThemes() {
		Manager manager = Manager.GetInstance();
		List<Theme> theme =  manager.getThemeDao().BuscarTodos();
		return theme;
	}
}
