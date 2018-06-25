package br.com.program.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.program.model.classes.Theme;

public class ThemeDao implements DaoGenerico<Theme>{
	
	private List<Theme> themes;
	private Long id;
	public ThemeDao() {
		themes = new ArrayList<Theme>();
		id = 0L;
	}
	
	public boolean salvar(Theme theme) {
		boolean saida;
		saida = false;
		Theme t = (Theme) theme;
		t.setId(id++ + 1);
		if (!(themes.contains(t)) && t.getName() != null) {
			themes.add(t);
			saida = true;
			
		}
		return saida;
	}
	public boolean remover(Long id) { 
		boolean saida;
		Theme theme = new Theme();
		theme.setId(id);
		
		saida = false;
		if (themes.contains(theme)) {
			themes.remove(theme);
			saida = true;
			
		}
		return saida;
	}

	@Override
	public Theme buscar(Long id) {
		for (Theme theme : themes) {
			if (theme.getId() == id)
				return theme;
		}
		return null;
	}

	@Override
	public List<Theme> BuscarTodos() {
		return themes;
	}
	public boolean Alterar(Object theme) {
		boolean saida;
		saida = false;
		Theme t = (Theme) theme;
		if ((themes.contains(t))) {
			themes.remove(t);
			themes.add(t);
			saida = true;
			
		}
		return saida;
	}
}
