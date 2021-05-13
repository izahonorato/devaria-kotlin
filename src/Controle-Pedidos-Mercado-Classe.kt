import classes.Produto

fun main (argumentos : Array<String>){
    if(argumentos.isEmpty()){
        println("Favor informar a lista de produtos que deseja comprar")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto( nome = "Arroz", preco = 35.10 ),
        Produto( nome = "Carne", preco = 59.89 ),
        Produto( nome = "Suco", preco = 2.40 ),
        Produto( nome ="Azeite", preco = 16.90 )
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter { produto -> argumentos.any{ argumento -> argumento.equals(produto.nome, ignoreCase = true)} }

    for(itemSelecionadoDisponivel in itensSelecionadosDisponiveis){
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    val itensSelecionadosIndisponiveis = argumentos.filter { argumentos -> !itensDisponiveis.any { produto -> produto.nome.equals(argumentos, ignoreCase = true)} }
    itensSelecionadosIndisponiveis.forEach { argumentos -> println("Este produto nós não temos: $argumentos") }

    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponível: " + "${it.exibirDadosProduto()}") }


}