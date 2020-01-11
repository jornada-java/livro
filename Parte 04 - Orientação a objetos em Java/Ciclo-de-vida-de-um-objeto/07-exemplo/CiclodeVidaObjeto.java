public class CiclodeVidaObjeto {

	public static void main(String[] args) {
		CicloDeVida obj1 = new CicloDeVida();
		obj1.nome = "Kamila";
		obj1 = new CicloDeVida();
		obj1.nome = "Kamila do segundo objeto";
		// aqui temos 2 objetos criados
		obj1 = null;
		// porém nenhum está acessível, pois foi atribuído o valor null
		// para a variável de referência, criando uma forma de bloqueio para a
		// referência do mesmo
		System.out.println("objetos=" + CicloDeVida.contador);
		System.out.println(obj1.nome);
		// Quantos podem ser coletados pelo GC?
		// Ambos pois não estão mais acessíveis
	}

}
