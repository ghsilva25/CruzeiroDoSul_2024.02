fun main() {
    // Instanciando um objeto da classe Pessoa
    val pessoa = Pessoa("João", 30)
    pessoa.exibirInformacoes()

    // Instanciando um objeto da classe Aluno
    val aluno = Aluno("Maria", 20, "2023001", "Engenharia")
    aluno.exibirInformacoes()

    // Instanciando um objeto da classe Funcionario
    val funcionario = Funcionario("Carlos", 40, 3000.00, "Gerente")
    funcionario.exibirInformacoes()
}
