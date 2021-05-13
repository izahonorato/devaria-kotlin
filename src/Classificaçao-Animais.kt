import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

fun main(argumentos : Array<String>){
    print("Informe qual animal: ")
    val animalInformado = readLine()

    if(animalInformado.isNullOrBlank() || animalInformado.isNullOrEmpty()){
        println("Animal informado não é válido")
        return
    }
    val listaDeAnimais = arrayOf(
        Peixe(nome = "Tubarão", qtdeNadadeiras = 2),
        Mamifero(nome = "Leão", qtdeMamas = 4),
        Ave(nome = "Gavião", qtdePenas = 500, consegueFazerMigracao = true),
        Reptil(nome = "Serpente", temperaturaCorporal = 8.0)
    )

    val animalSelecionado = listaDeAnimais.find { it.nome.equals(animalInformado, ignoreCase = true) }
    if(animalSelecionado == null){
        println("Animal informado não está na nossa base, tente novamente")
        return
    }

    when(animalSelecionado){
        is Mamifero -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é mamífero e tem as seguintes caracteristicas: " +
                "é aquático ${animalSelecionado.isMamiferoAquatico}, pode botar ovo: ${animalSelecionado.consegueBotarOvo}")
        is Reptil -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é réptil e tem as seguintes características: " +
                "é terrestre ${animalSelecionado.isReptilTerrestre} quantidade de patas ${animalSelecionado.qtdePatas}")
        is Ave -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é uma ave e tem as seguintes características: " +
                "sabe voar ${animalSelecionado.consegueVoar} consegue fazer migração ${animalSelecionado.consegueFazerMigracao}")
        is Peixe -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um peixe e tem as seguintes características: " +
                "de agua salgada ${animalSelecionado.isPeixeAguaSalgada} e carnívoro ${animalSelecionado.isCarnivoro}")
        else -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um animal não identificado ainda")
    }

}