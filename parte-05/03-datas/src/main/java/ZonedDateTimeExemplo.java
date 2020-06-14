import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExemplo {
    public static void main(String[] args) {
        ZonedDateTime hojeAgoraAqui = ZonedDateTime.now();

        ZoneId fusoDeSaoPaulo = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime diaHoraEmSaoPaulo = ZonedDateTime.of(
                2020, 5, 20, 9, 20, 0, 0, fusoDeSaoPaulo); // dia 20/05/2020 às 09:20 no fuso horário de São Paulo

        ZonedDateTime semHorarioDeVerao = ZonedDateTime.of(2018, 11, 3, 23, 30, 0, 0, fusoDeSaoPaulo); // dia 03/11/2018 às 23:30 no fuso horário de São Paulo
        ZonedDateTime comHorarioDeVerao = semHorarioDeVerao.plusHours(2); // mais 2 horas

        System.out.println(hojeAgoraAqui);
        System.out.println(diaHoraEmSaoPaulo);

        System.out.println(semHorarioDeVerao);
        System.out.println(comHorarioDeVerao);
    }
}
