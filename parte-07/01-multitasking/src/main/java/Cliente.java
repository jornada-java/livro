public class Cliente extends Thread {

    private String nome;
    private static Banco banco = new Banco();
    private Conta conta;
    private double valor = 200;

    public Cliente(String nome, Conta conta) {
        this.conta = conta;
        this.nome = nome;
    }

    @Override
    public void run() {
        double total = 0;
        while (banco.saque(conta, valor)) {
            total += valor;
        }
        System.out.println(getName() + " Sacou total de R$ " + total);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente01", new Conta("1", "123", 500));
        cliente.start();
    }

}
