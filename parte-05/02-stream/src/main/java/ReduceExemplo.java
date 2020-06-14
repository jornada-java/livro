import java.util.List;

public class ReduceExemplo {

    public static void main(String[] args) {
        List<Double> numeros = List.of(5.0, 9.0, 10.0);

        Double media = numeros.stream().reduce(Double::sum).get() / numeros.size();

        System.out.println(media);
    }
}
