fun main() {
    println("Digite um número:")
    val numero = readLine()?.toDoubleOrNull()

    when {
        numero == null -> println("Entrada inválida.")
        numero > 0 -> println("O número é positivo.")
        numero < 0 -> println("O número é negativo.")
        else -> println("O número é zero.")
    }
}
