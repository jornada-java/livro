import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Declarativo {

    public static void main(String[] args) {

        List<String> entradas = List.of("1", "2", "3", "A");

        Integer total = entradas.stream()
                .filter(StringUtils::isNumeric)
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .get();

        System.out.println("Total: " + total);
    }
}
