fun main(argumentos : Array<String>){

    println("Favor, informar o nome: ")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado inválido")
        return
    }

    println("Favor informar a idade do convidado: ")
    val idade = readLine()?.toIntOrNull() // o ponto de interrogação só permite o numero ser tratado se não for nulo, senao ele nao roda o .toIntOrNull

    if(idade == null || idade <= 0){
        println("A idade informada não é válida")
        return
    }

    var estaConvidado = false
    when(nome){
        "Kaique" -> estaConvidado = true
        "Daniel" -> estaConvidado = true
        "Amanda" -> estaConvidado = true
        "Izaura" -> estaConvidado = true
        else -> estaConvidado = false
    }

    if(estaConvidado && idade >= 18){
        println("Bem-vindo(a) à festa Kotlin!")
    }else if(estaConvidado == false){
        println("Você não está na lista de convidados")
    }else{
        println("Você é menor de idade, não é permitida entrada na festa")
    }
}