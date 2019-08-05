package br.edu.ifal.modelo;

import java.util.List;

public class Leilao {
	
	private List<Lance> lances = new ArrayList<Lance>();
	
	

	public Leilao(List<lance> lances) {
		super();
		this.lances = lances;
	}

	public List<lance> getLances() {
		return lances;
	}

	public void setLances(List<lance> lances) {
		this.lances = lances;
	}
	
	

}
