package br.com.program.model.listed;

public enum BonusType {
	QUESTION_BONUS(0), ADVANCING_HOUSE(1);
	
	private int valor;
	

	private BonusType(int valor) {
		this.valor = valor;
	}


	public int getValor() {
		return valor;
	}
	
	
}
