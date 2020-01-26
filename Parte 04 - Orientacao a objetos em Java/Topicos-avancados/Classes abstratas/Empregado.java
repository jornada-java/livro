public class Empregado extends Humano {
    private int idEmpregado;

    public Empregado (String seuNome, String seuGenero, int id){
        super(seuNome,seuGenero);
        this.idEmpregado=id;
    }

    //lembra do metodo da nossa classe abstrata?
    //aqui realizamos a implementacao dele
    @Override
    public void trabalhar(){
    if (idEmpregado==0){
        System.out.println("Não é um empregado desta empresa");
    }else{
        System.out.println("É um empregado desta empresa");
    }

}
 public static void main(String[] args) {
    Humano funcionario = new Empregado("Kamila", "Feminino", 999);
    Humano crianca = new Empregado("Crianca teste", "Masculino", 0);

    funcionario.trabalhar();
    crianca.trabalhar();
    System.out.println(funcionario.toString());
    System.out.println(crianca.toString());

}
}
