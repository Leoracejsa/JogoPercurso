package br.com.program.model.listed;

public enum TypeHome {
	HOME_NORMAL(0), HOME_END(1), HOME_BONUS(2);
	
	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	private TypeHome(Integer valor) {
		this.valor = valor;
	}
	
}
