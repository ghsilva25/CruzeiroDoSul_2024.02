fun main() {
    val strings: List<String?> = listOf("Kotlin", null, "Java", "Python", null, "C++")

    for (str in strings) {
        println(str?.let { it } ?: "Elemento nulo")
    }
}
