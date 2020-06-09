public class CicloDeVidaObjeto {

	public static void main(String[] args) {
		
		CicloDeVida obj1 = new CicloDeVida ();
		
		obj1.nome="Kamila";
		
		
		obj1= new CicloDeVida();
		obj1.nome="Kamila do segundo objeto";
		
		obj1=null;
	
		//Criação do objeto dentro de um bloco
		
		if (50>5) {
			CicloDeVida lc2 = new CicloDeVida ();
			//dentro do bloco temos um objeto acessível

		}
		
		//fora do objeto não temos nenhum objeto acessível, a obj2, só é visível dentro do bloco
		System.out.println("objetos="+CicloDeVida.contador);
		System.out.println(obj1.nome);

	
		}
	
	}