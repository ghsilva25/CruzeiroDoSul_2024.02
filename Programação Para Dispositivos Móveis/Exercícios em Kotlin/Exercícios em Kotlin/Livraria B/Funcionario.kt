class Funcionario(
    nome: String,
    idade: Int,
    var salario: Double,
    var cargo: String
) : Pessoa(nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Salário: R$$salario, Cargo: $cargo")
    }
}
