package br.com.program.model.manager;

import br.com.program.dao.QuestionDao;
import br.com.program.dao.ThemeDao;
import br.com.program.model.classes.GeneralSettings;

public class Manager {
	private  GeneralSettings conf;
	private  QuestionDao questionDao;
	private  ThemeDao themeDao;
	private static Manager instancia;
	private Manager() {
		
	}
	
	public static Manager GetInstance() {
		if 	(Manager.instancia == null) 
			Manager.instancia = new Manager();
		return Manager.instancia;
	}
	
	public  boolean atribuirConfiguracao(GeneralSettings config) {
		
		conf = config;
		return true;
	}
	public  GeneralSettings GetConfiguracoesGerais() {
		if (conf == null) {
			conf = new GeneralSettings();
		}
		return conf;
	}
	public  QuestionDao getQuestoesDao() {
		if (questionDao == null)
			questionDao = new QuestionDao();
		return questionDao;
	}
	public  ThemeDao getThemeDao() {
		if (themeDao  == null)
			themeDao = new ThemeDao();
		return themeDao;
	}

	
	
}
