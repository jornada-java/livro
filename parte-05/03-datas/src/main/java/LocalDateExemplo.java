import java.time.LocalDate;
import java.time.Month;

public class LocalDateExemplo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate vinteDeMaio = LocalDate.of(2020, 5, 20);
        System.out.println(hoje);
        System.out.println(vinteDeMaio);

        LocalDate vinteDeMaio1 = LocalDate.of(2020, Month.MAY, 20);
        System.out.println(vinteDeMaio1);

        LocalDate vinteEDoisDeMaio = vinteDeMaio.plusDays(2); // mais 2 dias
        LocalDate vinteDeAbril = vinteDeMaio.minusMonths(1); // menos 1 mês

        System.out.println(vinteEDoisDeMaio);
        System.out.println(vinteDeAbril);
    }
}
