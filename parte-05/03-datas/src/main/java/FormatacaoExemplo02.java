import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatacaoExemplo02 {

    public static void main(String[] args) {

        LocalDate vinteDeMaio = LocalDate.parse("2020-05-20", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(vinteDeMaio);

        DateTimeFormatter formatoLongo = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String stringLonga = vinteDeMaio.format(formatoLongo);

        DateTimeFormatter formatocurto = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String stringCurta = vinteDeMaio.format(formatocurto);

        System.out.println(stringLonga);
        System.out.println(stringCurta);

    }
}
