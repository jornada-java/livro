package exemplo01;

public class AlunoProfessorTeste {

    public static void main(String[] args) {
        Pessoa professor = new Professor("Pedro", 40, 10000);
        professor.fazerAniversario(); // Pedro agora tem 41 anos

        Pessoa aluno = new Aluno("Lucas", 11, "5o ano");
        aluno.fazerAniversario(); // Lucas agora tem 12 anos

        Escola escola = new Escola();
        escola.cadastrarPessoa(professor);
        escola.cadastrarPessoa(aluno);

    }
}
