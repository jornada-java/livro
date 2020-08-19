public class UpcastingAnimal {

    public static void main(String[] args) {
        Gatinho gatinho = new Gatinho();
        Animal animal = gatinho;
        animal = (Animal) gatinho;

        animal.seAlimentar();

    }

}
