package io.jornadas.jwt.model;

public class Usuario {
	private Long id;
	private String nome;
	private String login;
	private String email;

	public Usuario(Long id, String nome, String login, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
