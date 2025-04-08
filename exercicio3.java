public class exercicio3 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", "João Silva", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("67890", "Maria Oliveira", 500.0);

        conta1.depositar(200.0);
        conta1.sacar(150.0);
        System.out.println("Saldo da conta de " + conta1.getNomeTitular() + ": R$" + conta1.getSaldo());

        conta2.sacar(700.0); // Tentativa de saque maior que o saldo
        conta2.depositar(300.0);
        System.out.println("Saldo da conta de " + conta2.getNomeTitular() + ": R$" + conta2.getSaldo());
    }
}
class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Verifique o valor ou saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
