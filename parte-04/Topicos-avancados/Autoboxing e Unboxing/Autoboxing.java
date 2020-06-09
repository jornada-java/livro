public class Autoboxing{
    public int somaInteiros(List<Integer> listaInteiros){
        int soma=0;
        for (Integer i:listaInteiros)
        if (i%2==0)
                soma += i;
        return soma;
    }
}