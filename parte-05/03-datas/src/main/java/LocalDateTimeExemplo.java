import java.time.LocalDateTime;

public class LocalDateTimeExemplo {
    public static void main(String[] args) {
        LocalDateTime hojeAgora = LocalDateTime.now();
        LocalDateTime vinteDeMaioAsNoveEVinte = LocalDateTime.of(
                2020, 5, 20, 9, 20); // dia 20/05/2020 às 09:20
        System.out.println(hojeAgora);
        System.out.println(vinteDeMaioAsNoveEVinte);

        LocalDateTime vinteDeAbrilAsNoveEVinte = vinteDeMaioAsNoveEVinte.minusMonths(1); // menos 1 mês

        LocalDateTime vinteDeMaioAsNoveETrinta = vinteDeMaioAsNoveEVinte.plusMinutes(10); // mais 10 minutos

        System.out.println(vinteDeAbrilAsNoveEVinte);
        System.out.println(vinteDeMaioAsNoveETrinta);
    }
}
