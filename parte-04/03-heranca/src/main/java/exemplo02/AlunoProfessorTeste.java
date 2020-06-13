package exemplo02;

public class AlunoProfessorTeste {

    public static void main(String[] args) {
        Professor professor = new Professor("Pedro", 40, 10000);
        professor.fazerAniversario(); // Pedro agora tem 41 anos
        Aluno aluno = new Aluno("Lucas", 11, "5o ano");
        aluno.fazerAniversario(); // Lucas agora tem 12 anos

        System.out.println(professor.getIdade());
        System.out.println(aluno.getIdade());

    }
}
