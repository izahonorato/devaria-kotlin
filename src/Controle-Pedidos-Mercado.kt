fun main(argumentos : Array<String>){
    //validar se vieram produtos nos argumentos
    if(argumentos.isEmpty()){
        println("Favor, informar sua lista de produtos para verificarmos disponibilidade")
        return
    }
    val produtosDisponiveis = arrayOf("Pão", "Bolacha", "Queijo", "Feijão", "Ovo", "Frango", "Azeite", "Óleo")

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado) }

    for(produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nós temos: ${produtoRequisitadoDisponivel}")
    }

    val produtosRequisitadosNaoDisponiveis = argumentos.filter{produtoRequisitado -> !produtosDisponiveis.contains(produtoRequisitado)}
    produtosRequisitadosNaoDisponiveis.forEach { produtoNaoDisponivel -> println("Este produto nós não temos: $produtoNaoDisponivel") }

    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }
}