package br.edu.ifal.construtor;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.modelo.Avaliador;
import br.edu.ifal.modelo.Leilao;
import br.edu.ifal.modelo.Produto;
import br.edu.ifal.modelo.Usuario;

public class TDDTest {
	
	private CriadorDeLeilao criadorDeLeilao;
	
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	private Usuario usuario4;
	private Usuario usuario5;
	private Leilao leilao;
	private Avaliador avaliador;
	private CriadorDeUsuario criadorDeUsuario;
	
	@Before
	public void inicializar() {
		
		criadorDeLeilao = new CriadorDeLeilao(); 
		criadorDeUsuario = new CriadorDeUsuario();
		avaliador = new Avaliador();
		
		usuario1 = criadorDeUsuario.com("jose", "jose@hotmail.com").constroi();
		usuario2 = criadorDeUsuario.com("naomy", "naomy@hotmail.com").constroi();
		usuario3 = criadorDeUsuario.com("rayane", "rayane@hotmail.com").constroi();
		usuario4 = criadorDeUsuario.com("sandra", "sandra@hotmail.com").constroi();
		usuario5 = criadorDeUsuario.com("bruno", "bruno@hotmail.com").constroi();
	}
	
	
	
	@Test
	public void DeveFuncionarComUsuariosELancesDiferentes() {
		
		leilao = criadorDeLeilao.para(new Produto("TV"))
				.lance(usuario1, 100)
				.lance(usuario2, 300)
				.lance(usuario3, 300)
				.lance(usuario4, 500)
				.lance(usuario5, 600)
				.constroi();
		
		boolean validadeObtida = Avaliador.validarLeilao(leilao);
		boolean validadeEsperada = true;
	
		assertEquals(validadeEsperada, validadeObtida);
		
		
	}
	
	@Test
	public void NaoDeveFuncionaComMaisDeCindoLancesComMesmoUsuario() {
	
		leilao = criadorDeLeilao.para(new Produto ("TV"))
				.lance(usuario1, 100)
				.lance(usuario1, 300)
				.lance(usuario1, 300)
				.lance(usuario1, 500)
				.lance(usuario1, 600)
				.lance(usuario1, 600)
				.constroi();
		
		boolean validadeObtida = Avaliador.validarLeilao(leilao);
		boolean validadeEsperada = false;
	
		assertEquals(validadeEsperada, validadeObtida);
	

		
	}
	@Test
	public void DeveFuncionarCom3LancesPorUsuario() {
		leilao = criadorDeLeilao.para(new Produto ("TV"))

		.lance(usuario1, 100)
		.lance(usuario1, 300)
		.lance(usuario1, 300)
		.lance(usuario2, 500)
		.lance(usuario2, 600)
		.lance(usuario2, 600)
		.constroi();


		boolean validadeObtida = Avaliador.validarLeilao(leilao);
		boolean validadeEsperada = true;
	
		assertEquals(validadeEsperada, validadeObtida);
	
		
	}
	
	
	
	

}
