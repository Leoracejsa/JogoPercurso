package br.com.program.model.classes;

import br.com.program.model.listed.BonusType;

public class Bonus {
	private BonusType bonusType;

	public BonusType getTipoBonus() {
		return bonusType;
	}

	public Bonus setTipoBonus(BonusType bonusType) {
		this.bonusType = bonusType;
		return this;
	} 
	
	
}
