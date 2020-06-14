import java.time.Duration;
import java.time.LocalTime;

public class DurationExemplo {
    public static void main(String[] args) {
        Duration doisMilissegundos = Duration.ofMillis(2);
        Duration doisSegundos = Duration.ofSeconds(2);
        Duration doisMinutos = Duration.ofMinutes(2);
        Duration duasHoras = Duration.ofHours(2);
        Duration quarentaEOitoHoras = Duration.ofDays(2); // não armazena dias

        LocalTime noveEQuarenta = LocalTime.of(9, 40); // 09:40:00
        LocalTime onzeETrintaESeis = LocalTime.of(11, 36, 12); // 11:36:12

        Duration duracao = Duration.between(noveEQuarenta, onzeETrintaESeis);

        System.out.println(duracao);
    }
}
