fun main() {
    println("Digite um número:")
    val numero = readLine()

    if (numero != null) {
        val invertido = numero.reversed()
        println("Número invertido: $invertido")
    } else {
        println("Entrada inválida.")
    }
}
