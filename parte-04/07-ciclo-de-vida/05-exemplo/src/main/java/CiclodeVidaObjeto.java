
public class CiclodeVidaObjeto {

	public static void main(String[] args) {
		//aqui temos dois objetos criados 
		//o primeiro obj1 não é mais acessível pois feita outra referência a ele mais abaixo
		//ele foi atribuído para a segunda variável obj1		
		CicloDeVida obj1 = new CicloDeVida();
		obj1.nome = "Kamila";
		//se tentarmos imprimir essa inicialização novamente, será retornado o valor nulo, pois o mesmo objeto não está mais acessível
		obj1= new CicloDeVida();
		//ao atribuirmos novamente name a obj1, a referência é atualizada e para de retornar null
		obj1.nome="Kamila do segundo objeto";
		System.out.println("objetos=" + CicloDeVida.contador);
		System.out.println(obj1.nome);

	}

}
