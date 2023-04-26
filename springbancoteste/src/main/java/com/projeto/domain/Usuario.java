package com.projeto.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private long idusuario;
	
	@Column(nullable=false, unique=true)
	private String nomeusuario;
	
	@Column(nullable=false)
	private String senha;
	
	@Column(nullable=false)
	private String nivelacesso;
	
	public Usuario() {
	}

	public Usuario(long idusuario, String nomeusuario, String senha, String nivelacesso) {
		this.idusuario = idusuario;
		this.nomeusuario = nomeusuario;
		this.senha = senha;
		this.nivelacesso = nivelacesso;
	}

	public long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelacesso() {
		return nivelacesso;
	}

	public void setNivelacesso(String nivelacesso) {
		this.nivelacesso = nivelacesso;
	}
	
	
}
