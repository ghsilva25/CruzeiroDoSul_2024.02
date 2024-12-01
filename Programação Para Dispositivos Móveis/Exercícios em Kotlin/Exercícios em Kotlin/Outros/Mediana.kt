fun main() {
    println("Digite uma lista de números separados por espaço:")
    val input = readLine()?.split(" ")?.mapNotNull { it.toDoubleOrNull() }

    if (input != null && input.isNotEmpty()) {
        val sorted = input.sorted()
        val mediana = if (sorted.size % 2 == 0) {
            (sorted[sorted.size / 2 - 1] + sorted[sorted.size / 2]) / 2
        } else {
            sorted[sorted.size / 2]
        }
        println("A mediana é: $mediana")
    } else {
        println("Entrada inválida.")
    }
}
