package br.com.projetoescola.domain;

import java.sql.Date;

public class Curso {
	
	private Long idCurso;
	private String titulo;
	private String descricao;
	private Date datainicio;
	private Date datatermino;
	private String horainicio;
	private String haratermino;
	
	public Curso() {
	}

	public Curso(Long idCurso, String titulo, String descricao, Date datainicio, Date datatermino, String horainicio,
			String haratermino) {
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.descricao = descricao;
		this.datainicio = datainicio;
		this.datatermino = datatermino;
		this.horainicio = horainicio;
		this.haratermino = haratermino;
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(Date datatermino) {
		this.datatermino = datatermino;
	}

	public String getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}

	public String getHaratermino() {
		return haratermino;
	}

	public void setHaratermino(String haratermino) {
		this.haratermino = haratermino;
	}
	

}
