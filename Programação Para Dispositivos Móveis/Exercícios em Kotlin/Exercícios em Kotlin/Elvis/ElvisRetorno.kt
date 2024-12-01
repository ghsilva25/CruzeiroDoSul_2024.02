fun main() {
    println("Digite uma string (ou pressione Enter para nulo):")
    val input: String? = readLine()

    // Utiliza o operador Elvis diretamente
    val result = input ?: "Valor padrão"

    println("Resultado: $result")
}
