import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) : BigDecimal{
    when(operador){
        "+" -> return primeiroNumero + segundoNumero
        "-" -> return primeiroNumero - segundoNumero
        "*" -> return primeiroNumero * segundoNumero
        "/" -> return primeiroNumero / segundoNumero
        "%" -> return primeiroNumero % segundoNumero
        else -> return BigDecimal.ZERO
    }
}


fun main(){
    println("Digite um número válido: ")
    val primeiroNumero = readLine()?.toBigDecimal()

    if(primeiroNumero == null){
        println("Primeiro número é inválido")
        return
    }

    println("Digite um operador válido (+, -, *, /, %): ")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != "+" && operador != "-" && operador != "*" && operador != "/" && operador != "%")){
        println("Operador inválido")
        return
    }

    println("Digite um número válido: ")
    val segundoNumero = readLine()?.toBigDecimal()

    if(segundoNumero == null){
        println("Segundo número é inválido")
        return
    }
    val resultado = calculaOperacao(primeiroNumero, operador,segundoNumero)
    println("O resultado da operação é: $resultado")
}