import java.time.LocalTime;

public class LocalTimeExemplo {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        LocalTime noveEVinte = LocalTime.of(9, 20); // 09:20:00
        LocalTime noveEVinteComSegundo = LocalTime.of(9, 20, 1);

        System.out.println(agora);
        System.out.println(noveEVinte);
        System.out.println(noveEVinteComSegundo);

        LocalTime noveETrinta = noveEVinte.plusMinutes(10); // mais 10 minutos
        LocalTime dezEVinte =  noveEVinte.plusHours(1);

        System.out.println(noveETrinta);
        System.out.println(dezEVinte);
    }
}
