package br.com.program.model.factory;

import java.util.Random;

import br.com.program.model.classes.Bonus;
import br.com.program.model.classes.Home;
import br.com.program.model.classes.HomeBonus;
import br.com.program.model.listed.BonusType;
import br.com.program.model.listed.TypeHome;

public class HomeBonusFactory {
	
	public Home CriaCasaBonus(int numero) {
		HomeBonus homeBonus = new HomeBonus();
		Integer tipoBonus;
		Random rand = new Random();
		homeBonus.setNumero(numero);
		homeBonus.setTipo(TypeHome.HOME_BONUS);
		Bonus bonus = new Bonus();
		
		tipoBonus = rand.nextInt(2); 
		bonus.setTipoBonus(BonusType.values()[tipoBonus]);
		homeBonus.setBonus(bonus);
		return homeBonus;
	}

}
