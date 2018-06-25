package br.com.program.model.factory;

import java.util.ArrayList;
import java.util.List;

import br.com.program.model.classes.Perfil;
import br.com.program.model.listed.Color;

public class UserFactory {
	public static UserFactory getPerfilFactory() {
		return new UserFactory();
	}
	public List<Perfil> getListaPerfil(List<Color> cores, int quantidade){
		if (quantidade > cores.size()) {
			quantidade = cores.size();
		}
		List<Perfil> perfis = new ArrayList<Perfil>();
		Perfil perfil;
		Long id;
		for (Integer i = 0;  i <= quantidade-1; i++ ) {
			perfil = new Perfil();
			perfil.setCor(cores.get(i));
			id = Long.valueOf(i);
			perfil.setId(id);
			perfis.add(perfil);
		}
		return perfis;
	}
	
}
