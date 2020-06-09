
public class CiclodeVidaObjeto {

	public static void main(String[] args) {
		// este primeiro pode cair no recolhimento do Garbage Collector, pois não está
		// mais sendo acessível
		CicloDeVida obj1 = new CicloDeVida();
		obj1.nome = "Kamila";
		obj1 = new CicloDeVida();
		obj1.nome = "Kamila do segundo objeto";
		System.out.println("objetos=" + CicloDeVida.contador);
		System.out.println(obj1.nome);

	}

}
