fun main() {
    // Solicitar ao usuário o valor inicial
    println("Digite o valor inicial:")
    val valorInicial = readLine()?.toIntOrNull()

    // Solicitar ao usuário o valor final
    println("Digite o valor final:")
    val valorFinal = readLine()?.toIntOrNull()

    if (valorInicial != null && valorFinal != null && valorInicial <= valorFinal) {
        var produto = 1
        for (i in valorInicial..valorFinal) {
            produto *= i
        }
        println("O produto dos números entre $valorInicial e $valorFinal é: $produto")
    } else {
        println("Por favor, insira valores válidos. O valor inicial deve ser menor ou igual ao valor final.")
    }
}
