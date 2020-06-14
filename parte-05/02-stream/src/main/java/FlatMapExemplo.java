import static java.util.stream.Collectors.toList;

import java.util.List;

public class FlatMapExemplo {

    public static void main(String[] args) {

        List<List<Integer>> listas = List.of(List.of(1, 2, 3), List.of(4, 5, 6));

        List<Integer> numeros = listas.stream()
                .flatMap(lista -> lista.stream())
                .collect(toList());

        numeros.forEach(System.out::println); // 1, 2, 3, 4, 5, 6
    }
}
