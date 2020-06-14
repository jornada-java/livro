import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Imperativo {

    public static void main(String[] args) {

        List<String> entradas = List.of("1", "2", "3", "A");
        int total = 0;

        for (int i = 0; i < entradas.size(); i++) {

            String numero = entradas.get(i);

            if (StringUtils.isNumeric(numero)) {
                total = total + Integer.parseInt(numero);
            }
        }

        System.out.println("Total: " + total);
    }
}
