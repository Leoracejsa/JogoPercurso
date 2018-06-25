package br.com.program.model.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.program.model.classes.Home;

public class ListHomesFactory {

	private String mensagemFim;
	private int quantityHouses;
	Random rand;
	private HomeBonusFactory cbf;
	private HomeFactory cf;
	private FinalHomeFactory cff;
	
	public static ListHomesFactory getListaCasasFactory(List<String> mensagemFim, int quantityHouses) {
		ListHomesFactory lista = new ListHomesFactory();
		lista.quantityHouses  = quantityHouses;
		lista.rand = new Random();
		if(mensagemFim.size() <= 0) 
			lista.mensagemFim = null;		
		else
			lista.mensagemFim =  mensagemFim.get(lista.rand.nextInt(mensagemFim.size()));
		lista.cbf = new HomeBonusFactory();
		lista.cf = new HomeFactory();
		lista.cff = new FinalHomeFactory();
		return lista;
	}

	public List<Home> getListaCasas(int intervalo, int random, int minimoEntreBonus){
		intervalo = rand.nextInt(random) + minimoEntreBonus;
		int i = 0;
		int proximoBonusPossivel= intervalo + i ;
		List<Home> homes = new ArrayList<Home>();
		for (i = 0; i <= quantityHouses; i++) {
			if(i < quantityHouses) {
				if (i < proximoBonusPossivel) {
					homes.add(cf.CriaCasa(i));
				}else {
					if(rand.nextBoolean()) {
						homes.add(cbf.CriaCasaBonus(i));
						intervalo = rand.nextInt(3) + 2;
						proximoBonusPossivel = intervalo + i;					
					}else
						homes.add(cf.CriaCasa(i));
				 }
			}else {
				homes.add(cff.criaCasaFim(i,mensagemFim));				
			}			
		}
		return homes;
	}
}
