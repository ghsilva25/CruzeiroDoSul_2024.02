public class ContaCorrente {
    // Atributos
    private String titular;
    private double saldo;

    // Construtor
    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para transferência
    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f para %s realizada com sucesso!%n", valor, contaDestino.getTitular());
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.printf("Saldo da conta de %s: R$ %.2f%n", titular, saldo);
    }

    // Getter para o titular
    public String getTitular() {
        return titular;
    }

    public static void main(String[] args) {
        // Criando contas
        ContaCorrente conta1 = new ContaCorrente("Alice");
        ContaCorrente conta2 = new ContaCorrente("Bob");

        // Realizando operações
        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(conta2, 300);

        // Exibindo saldos
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
