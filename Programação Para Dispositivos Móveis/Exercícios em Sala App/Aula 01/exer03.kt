fun main(){

    var x = "Boa, deu certo!"

    var elvisOperator = retornaNull(x) ?: "Valor Padrão!"

    println(elvisOperator)

}


fun retornaNull(a: String): String? {
    if(a.equals("Boa, deu certo!"))
        return "Boa, deu certo!"

    else
        return null


}