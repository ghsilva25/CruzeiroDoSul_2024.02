fun main() {
    println("Digite uma string:")
    val input: String? = readLine()
    val length = input?.length ?: "A string é nula"
    println(length)
}
