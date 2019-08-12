package br.edu.ifal.controle;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.edu.ifal.modelo.Avaliador;
import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Leilao;
import br.edu.ifal.modelo.Usuario;

public class AvaliadorTest {
	
	private static final Leilao Leilao = null;
	@Test
	public void AvaliadorDeveFuncionarEmOrdemAleatoria(){
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("Ana");
		Usuario usuario3 = new Usuario ("Ana");
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance(usuario1, 300));
		leilao.propoe(new Lance(usuario2, 400));
		leilao.propoe(new Lance(usuario3, 250));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avaliar(leilao);
		double maiorLanceObtido = avaliador.getMaiorLance();
		double maiorLanceEsperado = 400;
		
		double menorLanceObtido = avaliador.getMaiorLance();
		double menorLanceEsperado = 250;
	  
	assertEquals(maiorLanceEsperado, maiorLanceObtido, 0.000001);
	assertEquals(menorLanceEsperado, menorLanceObtido, 0.000001);
	}
	@Test 
	public void AvaliadorDeveFuncionarEmOrdemCrescente(){
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance(usuario1, 250));
		leilao.propoe(new Lance(usuario2, 300));
		leilao.propoe(new Lance(usuario3, 400));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avaliar(leilao);
		double menorLanceObtido = avaliador.getMenorlance();
		double menorLanceEsperado = 400;
		
		double menorLanceObtido1 = avaliador.getMenorlance();
		double menorLanceEsperado1 = 250;
		
		  
		assertEquals(menorLanceEsperado1, menorLanceObtido1, 0.000001);
		assertEquals(menorLanceEsperado1, menorLanceObtido1, 0.000001);
		}
	@Test
	public void AvaliadorDeveFuncionarEmOrdemDecrescente(){
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance(usuario1, 400));
		leilao.propoe(new Lance(usuario2, 300));
		leilao.propoe(new Lance(usuario3, 250));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avaliar(leilao);
		double menorLanceObtido = avaliador.getMenorLance();
		double menorEsperado = 400;
		
		double menorLanceObtido1 = avaliador.getMenorLance();
		double menorLanceEsperado1 = 250;
		
		  
		assertEquals(menorLanceEsperado1, menorLanceObtido1, 0.000001);
		assertEquals(menorLanceEsperado1, menorLanceObtido1, 0.000001);
		
	}

	@Test
	public void avaliarTop3Maiores {
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 400;
		double segundoLanceEsperado = 300;
		double terceiroLanceEsperado = 250;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
	}
	
	@Test
	public void AvaliarEmOrdemAleatoria {
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 250;
		double segundoLanceEsperado = 300;
		double terceiroLanceEsperado = 400;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
	}
	@Test
	public void avaliadorDeveFuncionarEmOrdemDecrescente{ 
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 400;
		double segundoLanceEsperado = 300;
		double terceiroLanceEsperado = 250;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
	
	
	}
	@Test
	public void avaliadorFuncionarEmOrdemUnica{ 
		Usuario usuario1 = new Usuario ("Ana");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();

		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 400;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
	
	
	}
	@Test
	public void avaliadorfuncionarSegundoLance{ 
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 400;
		double segundoLanceEsperado = 300;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
}
	@Test
	public void avaliarTerceiroLance{ 
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 250;
		double segundoLanceEsperado = 300;
		double terceiroLanceEsperado = 400;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
	
}
	@Test
	public void AvaliarEmQuartoLance{ 
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		Usuario usuario4 = new Usuario ("Jose");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 250;
		double segundoLanceEsperado = 250;
		double terceiroLanceEsperado = 250;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, quartoLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
}
	@Test
	public void AvaliarQuintoLance{ 
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("italo");
		Usuario usuario3 = new Usuario ("luiz");
		Usuario usuario4 = new Usuario ("Jose");
		Usuario usuario5 = new Usuario ("Jose");
		
		Avaliador avaliador = new Avaliador();
		avaliador.setTop3Lances(Leilao);
		
		List<Lance> top3 = avaliador.getTop3Lance();
		
		double primeiroLanceObtido = top3.get(0).getValor();
		double segundoLanceObtido = top3.get(1).getValor();
		double terceiroLanceObtido = top3.get(2).getValor();
		int tamanhoTop3Obitido = top3.size();
		
		double primeiroLanceEsperado = 250;
		double segundoLanceEsperado = 250;
		double terceiroLanceEsperado = 250;
		int tamanhoTop3Esperado = 3;
		
		assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0,1.);
		assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
		assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
		assertEquals(quartoLanceEsperado, quartoLanceObtido, 0.1);
		assertEquals(tamanhoTop3Esperado, tamanhoTop3Obitido);	
		
}
}
	
	



