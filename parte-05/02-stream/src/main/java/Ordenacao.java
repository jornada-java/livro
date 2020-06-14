import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ordenacao {
	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Ana", 23, "celular 222-123");
		Autor autor2 = new Autor("Caio", 19, "telefone 111-312");
		Autor autor3 = new Autor("Bruna", 37, "trabalho 210-700");
					
		List<Autor> autores = List.of(autor1, autor2, autor3);
		
		List<Autor> autoresOrdenados = autores.stream().sorted(Comparator.comparing(Autor::getNome).reversed()).collect(Collectors.toList());

		autores.forEach(autor -> System.out.println(autor.getNome())); // Ana, Caio, Bruna 
		
		autoresOrdenados.forEach(autor -> System.out.println(autor.getNome())); // Ana, Bruna, Caio
	}
}