package br.com.program.model.listed;

public enum DifficultyLevel {
	EASY(0), MEDIUM(1), HARD(2);
	
	private int valor;

	private DifficultyLevel(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
