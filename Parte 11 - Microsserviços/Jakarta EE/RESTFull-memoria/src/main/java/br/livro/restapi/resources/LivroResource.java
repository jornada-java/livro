package br.livro.restapi.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
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

import br.livro.restapi.models.Livro;

@ApplicationScoped
@Path("livros") // define que a nossa aplicação irá responder em /livros
@Produces(MediaType.APPLICATION_JSON) // define que a nossa aplicação irá gerar resposta em JSON
@Consumes(MediaType.APPLICATION_JSON) // define que a nossa aplicação irá receber objetos JSON
public class LivroResource {
	static List<Livro> livros = new ArrayList<Livro>();

	@GET // Define que o método abaixo irá responder o get
	public Response buscarLivros() {
		// retorna os livros da lista
		return Response.ok(livros).build();
	}

	@POST // Define que o método abaixo irá responder ao post
	public Response criarLivro(Livro livro) {
		// adiciona um novo livro a lista
		livro.setId(UUID.randomUUID().toString());
		livros.add(livro);
		return Response.ok().build();
	}

	@GET // Define que o método abaixo irá responder o get
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response buscarLivro(@PathParam("id") String id) {
		// busca por um livro específico
		Livro livro = livros.stream().filter(e -> id.equals(e.getId())).findAny().orElse(null);

		// caso o livro não seja encontrado retorna 404
		if (livro == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(livro).build();
	}

	@PUT // Define que o método abaixo irá responder ao put
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response atualizarLivro(@PathParam("id") String id, Livro livro) {
		// busca por um livro específico
		Livro livroLocal = livros.stream().filter(e -> id.equals(e.getId())).findAny().orElse(null);

		// caso o livro não seja encontrado retorna 404
		if (livroLocal == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		// atualiza os livros
		livro.setId(id);
		livros = livros.stream().map(e -> id.equals(e.getId()) ? livro : e).collect(Collectors.toList());

		return Response.ok().build();
	}

	@DELETE // Define que o método abaixo irá responder ao delete
	@Path("{id}") // Define que o método tem como entrada um parâmetro de url
	public Response deletarLivro(@PathParam("id") String id) {
		Integer tamanhoAntigo = livros.size();

		// remove um livro da lista
		livros = livros.stream().filter(e -> !id.equals(e.getId())).collect(Collectors.toList());

		// caso nenhum livro tenha sido removido retorna 404
		if (tamanhoAntigo == livros.size()) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok().build();
	}
}