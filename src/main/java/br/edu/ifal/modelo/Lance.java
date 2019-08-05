package br.edu.ifal.modelo;

public class Lance {
	
	private String Usuario;
	private double valor;
	
	
	
	public Lance(String usuario, String valor) {
		super();
		Usuario = usuario;
		this.valor = valor;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
