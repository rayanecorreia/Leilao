package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Avaliador {
	
	
	private double maiorDeTodos =Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Lance> top3MaioresLances;      
	
	public double avaliar(Leilao leilao) {
		for(Lance lance:leilao.getLances()) {
			if(maiorDeTodos < lance.getValor()) {
				maiorDeTodos = lance.getValor();
			}
			if (lance.getValor() < menorDeTodos){
				menorDeTodos = lance.getValor();
		}
	}
		return maiorDeTodos;
}
	

	public void setTop3Lances(Leilao leilao) {
		top3MaioresLances = new ArrayList<Lance>(leilao.getLances());
		Collections.sort(top3MaioresLances, new Comparator<Lance>(){
			
			public int compare(Lance o1, Lance o2) {
				if(o1.getValor() < o2.getValor()) return 1;
				if(o1.getValor() > o2.getValor()) return -1;
				return 0;
				
			}
			
		});
		top3MaioresLances = top3MaioresLances.subList(0,3);
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	public double getMenorLance() {
		return menorDeTodos;
	}
	public List<Lance> getTop3Lance(){
		return top3MaioresLances;
	}


	public static boolean validarLeilao(Leilao leilao) {
		for(int i = 0; i < leilao.getLances().size();i++) {
			Usuario usuario = leilao.getLances().get(i).getUsuario();
			
		int qntLances = 0;
		
		for(Lance lance : leilao.getLances()) {
			if(lance.getUsuario().equals(usuario)) {
							qntLances++;

			}
		}
		if(qntLances > 5) {
			return false;
				
			}
			
			qntLances = 0;
		}  
		
			return true;
		
		}
		

	
	}


	


