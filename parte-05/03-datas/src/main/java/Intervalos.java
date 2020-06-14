import java.time.LocalDate;
import java.time.Period;

public class Intervalos {
    public static void main(String[] args) {
        LocalDate primeiraData = LocalDate.of(1990, 8, 6);
        LocalDate segundaData = LocalDate.of(2020, 1, 4);

        Period periodo = Period.between(primeiraData, segundaData);

        System.out.println(primeiraData);
        System.out.println(segundaData);
        System.out.println(periodo);
    }
}
