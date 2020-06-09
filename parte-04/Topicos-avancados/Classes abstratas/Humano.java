public abstract class Humano{
    private String nome;
    private String genero;

    public Humano(String seuNome, String seuGenero){
        this.nome=seuNome;
        this.genero=seuGenero;
    }

    //criacao do metodo abstrato
    public abstract void trabalhar();

    @Override
    public String toString(){
        return "Nome="+this.nome+"::Genero="+this.genero;

    }

   

}