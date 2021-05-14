package classes

open class FormaPagamento {
    open fun efetuarPagamento() : Unit{
        println("Não foi possível processar o pagamento com a forma de pagamento selecionada")
    }
}

class FormaPagamentoPix : FormaPagamento(){
    override fun efetuarPagamento(){
        println("Pagamento efetuado via PIX")
    }
}

class FormaPagamentoBoleto : FormaPagamento(){
    override fun efetuarPagamento(){
        println("Pagamento efetuado via Boleto")
    }
}