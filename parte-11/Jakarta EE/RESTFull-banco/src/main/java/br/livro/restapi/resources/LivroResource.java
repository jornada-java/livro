package br.livro.restapi.resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.livro.restapi.dao.LivroDAO;
import br.livro.restapi.models.Livro;

@RequestScoped // Muda para escopo de request
@Path("livros") // define que a nossa aplicação irá responder em /livros
@Produces(MediaType.APPLICATION_JSON) // define que a nossa aplicação irá gerar resposta em JSON
@Consumes(MediaType.APPLICATION_JSON) // define que a nossa aplicação irá receber objetos JSON
public class LivroResource {

	@Inject
	LivroDAO livroDAO;

	@GET // Define que o método abaixo irá responder o get
	public Response buscarLivros() {
		// retorna os livros da lista
		return Response.ok(livroDAO.getAll()).build();
	}

	@POST // Define que o método abaixo irá responder ao post
	public Response criarLivro(Livro livro) {
		// adiciona um novo livro a lista
		livroDAO.create(livro);
		return Response.ok().build();
	}

	@GET // Define que o método abaixo irá responder o get
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response buscarLivro(@PathParam("id") Long id) {
		// busca por um livro específico
		Livro livro = livroDAO.findById(id);

		// caso o livro não seja encontrado retorna 404
		if (livro == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(livro).build();
	}

	@PUT // Define que o método abaixo irá responder ao put
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response atualizarLivro(@PathParam("id") Long id, Livro livro) {
		// busca por um livro específico
		Livro livroBanco = livroDAO.findById(id);

		// caso o livro não seja encontrado retorna 404
		if (livroBanco == null) {
			return Response.status(Status.NOT_FOUND).build();
		}

		livroBanco.setNome(livro.getNome());
		livroBanco.setAutor(livro.getAutor());

		// atualiza os livros
		livroDAO.update(livroBanco);
		return Response.ok().build();
	}

	@DELETE // Define que o método abaixo irá responder ao delete
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response deletarLivro(@PathParam("id") Long id) {
		// busca por um livro específico
		Livro livro = livroDAO.findById(id);

		// caso o livro não seja encontrado retorna 404
		if (livro == null) {
			return Response.status(Status.NOT_FOUND).build();
		}

		livroDAO.delete(livro);

		return Response.ok().build();
	}
}