package exemplo02;

public class EscolaTeste {

    public static void main(String[] args) {
        Pessoa professor = new Professor("Pedro", 40, 10000);
        professor.fazerAniversario(); // Pedro agora tem 41 anos e nenhuma mensagem será impressa
        professor.fazerAdmissao(); // Será impressa a mensagem "Olá, professor(a)! Seu salário será de 10000"

        Pessoa aluno = new Aluno("Lucas", 11, "5o ano");
        aluno.fazerAniversario(); // Lucas agora tem 12 anos e nenhuma mensagem será impressa
        aluno.fazerAdmissao(); // Será impressa a mensagem "Peça a seus pais para fazerem sua matrícula na secretaria!"
    }
}
