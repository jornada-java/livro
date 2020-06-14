import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExemplo {
    public static void main(String[] args) {
        Instant agora = Instant.now();
        Instant vinteDeMaioAsNoveEVinte = Instant.ofEpochSecond(1589977200);

        System.out.println(agora);
        System.out.println(vinteDeMaioAsNoveEVinte);

        Instant maisUmSegundo = agora.plusSeconds(1);
        Instant maisUmDia = agora.plus(1, ChronoUnit.DAYS);

        System.out.println(maisUmSegundo);
        System.out.println(maisUmDia);
    }
}
