public class Funcionario{
    private int id;
    private String nome;
    private String email;

    //aqui sobrescrevemos a chamada do HashCode()
   /*  @Override
    public int hashCode(){
        return 1;
    } */
    //hashCode() otimizado
    @Override
    public int hashCode(){
        return (int) id * nome.hashCode()*email.hashCode();
    }
    @Override
    //lembra do equals? Vamos usar ele aqui
    public boolean equals (Object a){
        if (this==a) return true;
        if (a==null) return false;
        if (this.getClass()!=a.getClass())return false;
        Funcionario funcionario=(Funcionario) a;
        return id==funcionario.id
        && (nome.equals(funcionario.nome)
        && email.equals(funcionario.email));
    }

    

}