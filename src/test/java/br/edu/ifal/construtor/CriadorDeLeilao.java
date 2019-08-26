package br.edu.ifal.construtor;

import br.edu.ifal.modelo.*;




public class CriadorDeLeilao {
	
	private Leilao leilao;
	public CriadorDeLeilao() {
		
	}
	public CriadorDeLeilao para(Produto produto) {
		this.leilao = new Leilao(produto);
		return this;
	}
	public CriadorDeLeilao lance(Usuario usuario, double valor) {
		this.leilao.propoe(new Lance(usuario, valor));
		return this;
		
	}
	public Leilao constroi () {
		return this.leilao;
	}

	
   

}
