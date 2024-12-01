class ContaCorrente(
    var numeroConta: String,
    var saldo: Double = 0.0
) {
    fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$$valor realizado. Saldo atual: R$$saldo")
        } else {
            println("Valor de depósito deve ser positivo.")
        }
    }

    fun saque(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado. Saldo atual: R$$saldo")
        } else {
            println("Saque inválido. Verifique o valor e o saldo disponível.")
        }
    }

    fun transferencia(valor: Double, contaDestino: ContaCorrente) {
        if (valor > 0 && valor <= saldo) {
            saque(valor) // Realiza o saque na conta origem
            contaDestino.deposito(valor) // Realiza o depósito na conta destino
            println("Transferência de R$$valor realizada para a conta ${contaDestino.numeroConta}.")
        } else {
            println("Transferência inválida. Verifique o valor e o saldo disponível.")
        }
    }
}
