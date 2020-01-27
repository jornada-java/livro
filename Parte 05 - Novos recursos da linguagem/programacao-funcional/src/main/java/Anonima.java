public class Anonima {

	public interface Carro{
		void ligar();
	}

	public static void main(String[] args) {
		
		Carro novo = new Carro() {
			public void ligar() {
				System.out.println("Ligado!");
			}
		};
		
		Carro quebrado = new Carro() {
			public void ligar() {
				System.out.println("Não liga mais!");
			}
		};
		
		novo.ligar();
		quebrado.ligar();
	}
}