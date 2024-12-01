fun main() {
    println("Digite a primeira string:")
    val primeira = readLine()
    println("Digite a segunda string:")
    val segunda = readLine()

    val concatenada = (primeira ?: "") + (segunda ?: "")
    println("String concatenada: $concatenada")
}
