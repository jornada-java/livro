import java.util.List;

public class DistinctExemplo {

	public static void main(String[] args) {
		List<Integer> figurinhas = List.of(1, 2, 3, 2, 3);
		
		figurinhas.stream()
			.distinct()
			.forEach(System.out::println); // 1, 2, 3
	}
}
