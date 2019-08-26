package br.edu.ifal.construtor;

import br.edu.ifal.modelo.Usuario;

public class CriadorDeUsuario {
	
	private Usuario usuario;
	
	public CriadorDeUsuario com(String nome, String email) {
		this.usuario = new Usuario(nome);
		this.usuario.setEmail(email);
		return this;
	}
	public Usuario constroi() {
		return this.usuario;
	}

}
