fun main() {
    println("Digite uma string (ou pressione Enter para nulo):")
    val input: String? = readLine()
    val result = input ?: "Valor padrão"
    println(result)
}
