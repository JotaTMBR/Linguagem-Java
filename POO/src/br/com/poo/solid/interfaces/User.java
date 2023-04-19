package br.com.poo.solid.interfaces;

public class User {
	private int id;
	private String nomeUsuario;
	private String senha;
	
	public User() {
	}

	public User(int id, String nomeUsuario, String senha) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
