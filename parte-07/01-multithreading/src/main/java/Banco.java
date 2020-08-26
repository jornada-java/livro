public class Banco {

    public boolean saque(Conta conta, double valor) {
        double saldo = conta.getSaldo();
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
        double novoSaldo = saldo - valor;
        System.out.println(Thread.currentThread().getName() +
                " sacou R$ " + valor + ". Saldo após saque: R$" + novoSaldo);
        conta.setSaldo(novoSaldo);
        return true;
    }

}
