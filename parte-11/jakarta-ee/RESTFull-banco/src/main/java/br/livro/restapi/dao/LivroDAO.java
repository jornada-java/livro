package br.livro.restapi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.livro.restapi.models.Livro;

@Stateless
public class LivroDAO {

	@PersistenceContext
	EntityManager gerenciadorEntidades;

	public List<Livro> getAll() {
		TypedQuery<Livro> consulta = gerenciadorEntidades.createNamedQuery("Livro.findAll", Livro.class);
		return consulta.getResultList();
	}

	public void create(Livro livro) {
		gerenciadorEntidades.persist(livro);
	}

	public Livro findById(Long id) {
		return gerenciadorEntidades.find(Livro.class, id);
	}

	public void update(Livro livro) {
		gerenciadorEntidades.merge(livro);
	}

	public void delete(Livro livro) {
		if (!gerenciadorEntidades.contains(livro)) {
			livro = gerenciadorEntidades.merge(livro);
		}
		gerenciadorEntidades.remove(livro);
	}
}