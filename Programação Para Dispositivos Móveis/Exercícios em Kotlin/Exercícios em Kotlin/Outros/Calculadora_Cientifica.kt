fun main() {
    println("Escolha uma operação: (1) Exponenciação (2) Raiz quadrada")
    val opcao = readLine()?.toIntOrNull()

    when (opcao) {
        1 -> {
            println("Digite a base:")
            val base = readLine()?.toDoubleOrNull()
            println("Digite o expoente:")
            val expoente = readLine()?.toDoubleOrNull()

            if (base != null && expoente != null) {
                val resultado = Math.pow(base, expoente)
                println("Resultado: $resultado")
            } else {
                println("Entrada inválida.")
            }
        }
        2 -> {
            println("Digite o número:")
            val numero = readLine()?.toDoubleOrNull()

            if (numero != null) {
                val resultado = Math.sqrt(numero)
                println("Resultado: $resultado")
            } else {
                println("Entrada inválida.")
            }
        }
        else -> println("Opção inválida.")
    }
}
