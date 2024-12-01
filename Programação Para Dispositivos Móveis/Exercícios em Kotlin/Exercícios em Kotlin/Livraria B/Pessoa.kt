open class Pessoa(
    var nome: String,
    var idade: Int
) {
    open fun exibirInformacoes() {
        println("Nome: $nome, Idade: $idade")
    }
}
