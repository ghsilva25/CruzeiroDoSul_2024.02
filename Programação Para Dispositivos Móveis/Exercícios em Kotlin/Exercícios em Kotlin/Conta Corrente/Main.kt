fun main() {
    val conta1 = ContaCorrente("12345-6")
    val conta2 = ContaCorrente("65432-1")

    // Testando depósitos
    conta1.deposito(500.0)
    conta2.deposito(300.0)

    // Testando saques
    conta1.saque(200.0)
    conta2.saque(100.0)

    // Testando transferência
    conta1.transferencia(100.0, conta2)

    // Verificando saldos finais
    println("Saldo final da conta 1: R$$${conta1.saldo}")
    println("Saldo final da conta 2: R$$${conta2.saldo}")
}
