class Aluno(
    nome: String,
    idade: Int,
    var matricula: String,
    var curso: String
) : Pessoa(nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Matrícula: $matricula, Curso: $curso")
    }
}
