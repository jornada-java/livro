import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConversaoExemplo {
    public static void main(String[] args) {
        // de ZonedDateTime para Calendar:
        ZonedDateTime zdt = ZonedDateTime.now();
        Calendar zdtParaCalendar = GregorianCalendar.from(zdt);

        // de Calendar para Instant:
        Calendar calendar = Calendar.getInstance();
        Instant calendarParaInstant = calendar.toInstant();

        // de Date para Instant:
        Date date = new Date();
        Instant dateParaInstant = date.toInstant();

        // de Instant para Date:
        Instant instant = Instant.now();
        Date instantParaDate = Date.from(instant);
    }
}
