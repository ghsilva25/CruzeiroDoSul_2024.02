fun main() {
    println("Digite um número:")
    val numero = readLine()

    if (numero != null) {
        val isPalindromo = numero == numero.reversed()
        if (isPalindromo) {
            println("O número é palíndromo.")
        } else {
            println("O número não é palíndromo.")
        }
    } else {
        println("Entrada inválida.")
    }
}
