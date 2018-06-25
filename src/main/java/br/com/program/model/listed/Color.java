package br.com.program.model.listed;

public enum Color {
	ORANGE(0), GREEN(1), GRAY(2), BLACK(3), BROWN(4), PINK(5);
	
	private int valor;

	private Color(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
