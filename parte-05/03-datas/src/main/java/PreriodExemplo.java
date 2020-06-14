import java.time.Period;

public class PreriodExemplo {
    public static void main(String[] args) {
        Period doisDias = Period.ofDays(2);
        Period doisMeses = Period.ofMonths(2);
        Period doisAnos = Period.ofYears(2);
        Period doisAnosUmMesETresDias = Period.of(2, 1, 3);

        System.out.println(doisDias);
        System.out.println(doisMeses);
        System.out.println(doisAnos);
        System.out.println(doisAnosUmMesETresDias);
    }
}
