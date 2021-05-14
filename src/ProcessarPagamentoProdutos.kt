import classes.*
import classes.FormaPagamentoEnum.Pix
import classes.FormaPagamentoEnum.Boleto
import classes.Produto

fun main(argumentos : Array<String>){
    if(argumentos.isEmpty()){
        println("Favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto("Tênis", 298.0),
        Produto("Bola", 220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any{ argumento -> it.nome.equals(argumento, ignoreCase = true) }
    }

    if(produtosSelecionados.isEmpty()){
        print("Os produtos selecionados não estão disponíveis")
        return
    }

    println("Favor imformar a forma de pagamento desejada (Boleto ou Pix)")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank()){
        println("Favor informar uma forma de pagamento válida")
        return
    }

    val formaPagamento : FormaPagamento = if (formaPagamentoSelecionada == (Pix.toString())){
        FormaPagamentoPix()
    }else if (formaPagamentoSelecionada == (Boleto.toString())){
        FormaPagamentoBoleto()
    }else{
        FormaPagamento()
    }
    println("Seus produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProduto()) }
    formaPagamento.efetuarPagamento()
}