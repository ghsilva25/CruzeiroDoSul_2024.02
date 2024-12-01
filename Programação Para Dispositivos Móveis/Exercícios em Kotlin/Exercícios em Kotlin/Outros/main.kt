fun main() {
    // Taxa de câmbio (1 dólar = 5 reais)
    val taxaDeCambio = 5.00

    // Solicitar ao usuário o valor em dólares
    println("Digite o valor em dólares (USD): ")
    val valorEmDolares = readLine()?.toDoubleOrNull()

    if (valorEmDolares != null) {
        // Converter para reais
        val valorEmReais = valorEmDolares * taxaDeCambio
        println("O valor em reais (BRL) é: R$ %.2f".format(valorEmReais))
    } else {
        println("Por favor, insira um valor válido.")
    }
}
