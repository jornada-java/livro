public class CicloDeVidaObjeto {
    public static void main(String[] args) {
        CicloDeVida cicloDeVida = new CicloDeVida();
        CicloDeVida obj1 = new CicloDeVida();
        obj1.nome = "Kamila";
        cicloDeVida.obj4 = obj1;
        obj1 = new CicloDeVida();
        obj1.nome = "Kamila do segundo objeto";
        cicloDeVida.obj5 = obj1;
        obj1 = null;
        //Aqui estamos referenciando  um objeto que não está mais acessível para um objeto que está acessível.
        //Realizando uma referência indireta,o GC não vai mais excluir estes objetos.
        System.out.println("objetos=" + cicloDeVida.contador);
        System.out.println(cicloDeVida.obj4.nome);
        System.out.println(cicloDeVida.obj5.nome);
    }
}
