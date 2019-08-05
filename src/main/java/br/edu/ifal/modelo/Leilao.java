package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	
	private List<Lance> lances;
	
	public void propoe(Lance lance) {
		lances.add(lance);
		
		
	}
	

	public Leilao(List<Lance> lances) {
		super();
		lances =  new ArrayList<Lance>();
		
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}
	
	

}
