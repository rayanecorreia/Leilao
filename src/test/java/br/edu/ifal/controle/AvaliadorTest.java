package br.edu.ifal.controle;

import static org.junit.Assert.assertEquals;

import br.edu.ifal.modelo.Avaliador;
import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Leilao;
import br.edu.ifal.modelo.Usuario;

public class AvaliadorTest {
	
	@test
	public void test1() {
		Usuario usuario1 = new Usuario ("Ana");
		Usuario usuario2 = new Usuario ("Ana");
		Usuario usuario3 = new Usuario ("Ana");
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance(usuario1, 300));
		leilao.propoe(new Lance(usuario2, 400));
		leilao.propoe(new Lance(usuario3, 250));
		
		Avaliador avaliador = new Avaliador();
		avaliador .avaliar(leilao);
	  double maiorLanceObtido = avaliador.getMaiorLance();
	  double maiorLanceEsperado = 400;
	  
	  assertEquals(maiorLanceEsperado, maiorLanceObtido, 0.000001);
	}

	private void assertEquals(double maiorLanceEsperado, double maiorLanceObtido, double d) {
		// TODO Auto-generated method stub
		
	}
	
	}


