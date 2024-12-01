fun main() {
    println("Digite o valor em metros:")
    val metros = readLine()?.toDoubleOrNull()

    if (metros != null) {
        val quilometros = metros / 1000
        println("$metros metros são ${quilometros} quilômetros.")
    } else {
        println("Entrada inválida.")
    }
}
