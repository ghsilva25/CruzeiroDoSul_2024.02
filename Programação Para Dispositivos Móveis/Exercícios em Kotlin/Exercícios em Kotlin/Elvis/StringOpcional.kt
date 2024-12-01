fun main() {
    println("Digite uma string (ou pressione Enter para nulo):")
    val input: String? = readLine()
    val result = processString(input)
    println("Resultado: $result")
}

fun processString(input: String?): String {
    return input ?: "Valor padrão"
}
