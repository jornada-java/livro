import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoExemplo01 {

    public static void main(String[] args) {

        LocalDate vinteDeMaio = LocalDate.of(2020, 5, 20);
        String vinteDeMaioStr = vinteDeMaio.format(DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDateTime vinteDeMaioAsNove = LocalDateTime.of(2020, 5, 20, 9, 0);
        String vinteDeMaioAsNoveStr = vinteDeMaioAsNove.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(vinteDeMaioStr);
        System.out.println(vinteDeMaioAsNoveStr);

        LocalDate vinteDeMaio1 = LocalDate.parse("2020-05-20", DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
