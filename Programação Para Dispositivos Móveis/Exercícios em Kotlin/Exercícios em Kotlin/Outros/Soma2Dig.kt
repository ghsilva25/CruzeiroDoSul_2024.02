fun main() {
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val soma = numero.toString().map { it.toString().toInt() }.sum()
        println("A soma dos dígitos é: $soma")
    } else {
        println("Entrada inválida.")
    }
}
