public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }
    public void depositar(double valor) {
        if (valor > 0 ) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado. Novo Saldo é de: R$ " + saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado. Novo valor é de: R$ " + saldo);
        } else {
            System.out.println("O saque não foi realizado. Saldo insuficiente. ");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public static void main(String [] args) {
        ContaBancaria conta = new ContaBancaria(100);
        conta.depositar(50);
        conta.sacar(30);
        conta.sacar(150);
        System.out.println("O saldo final é de: R$" + conta.getSaldo());
    }
}
