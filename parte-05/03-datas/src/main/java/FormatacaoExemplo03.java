import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatacaoExemplo03 {

    public static void main(String[] args) {

        LocalDate vinteDeMaio = LocalDate.of(2020, 5, 20);

        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // formato dia.mês.ano
        String stringPersonalizada = vinteDeMaio.format(formatoPersonalizado);

        System.out.println(stringPersonalizada);

    }
}
