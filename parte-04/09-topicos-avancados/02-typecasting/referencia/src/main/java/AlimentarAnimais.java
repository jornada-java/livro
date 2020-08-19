import java.util.ArrayList;
import java.util.List;

public class AlimentarAnimais {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Gatinho());
        animais.add(new Cachorrinho());

        for (Animal animal : animais) {
            alimentar(animal);
        }

        alimentar(animais);

    }

    public static void alimentar(Animal animal) {
        animal.seAlimentar();
        if (animal instanceof Gatinho) {
            ((Gatinho) animal).arranhar();
        }
    }

    public static void alimentar(List<Animal> animais) {
        animais.forEach(animal -> {
            animal.seAlimentar();
        });
    }

}

