package br.com.program.model.factory;

import br.com.program.model.classes.Home;
import br.com.program.model.classes.LastHome;
import br.com.program.model.listed.TypeHome;

public class FinalHomeFactory {
	public Home criaCasaFim(int numero, String mensagem) {
		LastHome casa = new LastHome();
		casa.setNumero(numero);
		casa.setTipo(TypeHome.HOME_END);
		casa.setMensagemConclusao(mensagem);
		return casa;
		
	}
}
