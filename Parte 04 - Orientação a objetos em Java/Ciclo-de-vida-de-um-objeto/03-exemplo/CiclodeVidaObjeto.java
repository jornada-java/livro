public class CiclodeVidaObjeto {
	public static void main(final String[] args) {
		CicloDeVida obj1 = new CicloDeVida();
		// aqui temos um objeto referenciado, que é acessível, pois consegue utilizar os
		// atributos da classe CicloDeVida que foi instanciada
		new CicloDeVida();
		obj1.nome = "Kamila";
		System.out.println("objetos=" + CicloDeVida.contador);
		System.out.println(obj1.nome);
	}
}