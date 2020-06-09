package br.livro.restapi.models;

import java.io.Serializable;

//package e imports

public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;

	String id;
	private String nome;
	private String autor;

	public Livro() {}

	public Livro(String id, String nome, String autor) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	//setters e getters
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}