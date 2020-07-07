package br.livro.restapi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//package e imports

@Entity // Define que esta classe representa uma entidade de banco de dados
@Table(name = "Livro") // define o nome da tabela que esta entidade representa
@NamedQueries({ // Consultas
		@NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l") })
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id // Define que esta variável será a representação do id do banco de dados
	@GeneratedValue // define que este id é gerado automaticamente
	private Long id;
	private String nome;
	private String autor;

	public Livro() {
	}

	public Livro(Long id, String nome, String autor) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	// setters e getters
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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