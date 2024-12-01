fun main() {
    // Instanciando 3 Autores
    val autor1 = Autor("J.K. Rowling", "123.456.789-00")
    val autor2 = Autor("George R.R. Martin", "987.654.321-00")
    val autor3 = Autor("Agatha Christie", "456.789.123-00")

    // Instanciando 3 Editoras
    val editora1 = Editora("Editora A", "Rua das Flores, 123", "12.345.678/0001-99")
    val editora2 = Editora("Editora B", "Av. dos Liberdade, 456", "98.765.432/0001-11")
    val editora3 = Editora("Editora C", "Praça do Conhecimento, 789", "11.222.333/0001-22")

    // Instanciando 3 Livros
    val livro1 = Livro("Harry Potter e a Pedra Filosofal", 1997, autor1, editora1)
    val livro2 = Livro("As Crônicas de Gelo e Fogo", 1996, autor2, editora2)
    val livro3 = Livro("Assassinato no Expresso do Oriente", 1934, autor3, editora3)

    // Exibindo informações
    println("Autores:")
    println(autor1)
    println(autor2)
    println(autor3)

    println("\nEditoras:")
    println(editora1)
    println(editora2)
    println(editora3)

    println("\nLivros:")
    println(livro1)
    println(livro2)
    println(livro3)
}
