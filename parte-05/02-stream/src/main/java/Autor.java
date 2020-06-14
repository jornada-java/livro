public class Autor {

    private final String nome;
    private final Integer idade;
    private final String contato;

    public Autor(String nome, Integer idade, String contato) {
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getContato() {
        return contato;
    }
}
