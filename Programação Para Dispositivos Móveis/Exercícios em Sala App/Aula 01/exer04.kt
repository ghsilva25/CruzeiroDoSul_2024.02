fun main(){

    var idade: Int

    println("Informe um valor:")
    idade = readLine()?.toInt()!!

    if(idade > 10)
        println("Pode Entrar!")

    else
        println("Não Pode Entrar!")
}