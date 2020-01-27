import java.util.List;

public class MapExemplo {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3);
		
		numeros.stream()
			.map(Double::new)
			.forEach(System.out::println);
	}
}
