public class AlimentarAnimais {
 
    public void  alimentar(List<Animal> animais) {
        animais.forEach(animal -> {
            animal.seAlimentar();
        });
    }

    List<Animal> animais = new ArrayList<>();
    animais.add(new Gatinho());
    animais.add(new Cachorro());
    new AlimentarAnimais().alimentar(animais);
}

