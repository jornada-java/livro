import java.util.List;
import java.util.function.Consumer;

public class LambdaExemplo {

	public static void main(String[] args) {

		Autor autor1 = new Autor("nome1", 1, "telefone 9999");
		Autor autor2 = new Autor("nome2", 2, "celular 8888");

		List<Autor> autores = List.of(autor1, autor2);

		autores.forEach(new Consumer<Autor>() {
			public void accept(Autor autor) {
				System.out.println(autor.getNome());
			}
		});

		autores.forEach(autor -> {
			System.out.println(autor.getIdade());
		});

		autores.forEach(autor -> System.out.println(autor.getContato()));
	}
}