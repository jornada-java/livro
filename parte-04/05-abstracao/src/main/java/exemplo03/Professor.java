package exemplo03;

public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    // implementando o método abstrato
    public void fazerAdmissao(){
        System.out.println("Olá, professor(a)! Seu salário será de " + salario);
    }
}
