package classes
//open identifica a classe pai
open class Animal(val nome : String)

class Mamifero(nome: String, val qtdeMamas : Int = 0, val isMamiferoAquatico : Boolean=false, val consegueBotarOvo : Boolean=false) : Animal(nome)

class Reptil(nome : String, val temperaturaCorporal : Double=20.0, val isReptilTerrestre : Boolean=true, val qtdePatas : Int=4) : Animal(nome)

class Ave(nome: String, val qtdePenas: Int=100, val consegueVoar : Boolean=true, val consegueFazerMigracao : Boolean=true) : Animal(nome)

class Peixe(nome : String, val qtdeNadadeiras : Int=2, val isPeixeAguaSalgada : Boolean=true, val isCarnivoro : Boolean=true) : Animal(nome)