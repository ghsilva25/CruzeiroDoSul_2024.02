fun main() {
    println("Digite uma string:")
    val input = readLine() ?: ""

    val totalLetras = input.count { it.isLetter() }
    val vogais = input.count { it.lowercaseChar() in "aeiou" }
    val consoantes = totalLetras - vogais

    println("Total de letras: $totalLetras")
    println("Total de vogais: $vogais")
    println("Total de consoantes: $consoantes")
}
