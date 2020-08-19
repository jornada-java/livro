public class DowncastingAnimal {

    public static void main(String[] args) {
        Animal animal = new Gatinho();
        ((Gatinho) animal).arranhar();

    }

}
