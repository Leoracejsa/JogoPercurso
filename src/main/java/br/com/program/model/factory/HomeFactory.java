package br.com.program.model.factory;

import br.com.program.model.classes.Home;
import br.com.program.model.listed.TypeHome;

public class HomeFactory {
	public Home CriaCasa(int numero) {
		Home home = new Home();
		home.setNumero(numero);
		home.setTipo(TypeHome.HOME_NORMAL);
		return home;		
	}
}
