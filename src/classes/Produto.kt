package classes

//criação de classe com dois atributos e o construtor entre parenteses
class Produto (val nome : String, val preco : Double){
    fun exibirDadosProduto() : String{
        return "Produto nome : $nome e valor R$ $preco"
    }
}