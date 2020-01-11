
public class CicloDeVidaObjeto {

	public static void main(String[] args) {
		CicloDeVida obj1 = new CicloDeVida();
		obj1.nome = "Kamila";
		obj1 = new CicloDeVida();
		obj1.nome = "Kamila do segundo objeto";
		// obj1=null;
		// Criação do objeto dentro de um bloco
		if (50 > 5) {
			CicloDeVida obj2 = new CicloDeVida();
			// dentro do bloco temos um objeto acessível
		}
		// a referência fica aqui, não dentro do bloco,
		// a cada execução do laço for, a referência é armazenada em obj3, fora do bloco
		// sendo ele acessível por toda a aplicação
		CicloDeVida obj3;
		for (int i = 0; i < 10; i++) {
			obj3 = new CicloDeVida();
		}
		// temos 13 objetos criados
		// 1 é acessível
		System.out.println("objetos=" + CicloDeVida.contador);
		System.out.println(obj1.nome);

	}

}
