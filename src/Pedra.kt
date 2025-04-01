class Pedra {
    var pontos: Int = 0
    fun luta(elemento: String) : Int {
        if (elemento == ("PEPEL")) {
            println("Você perdeu!!")
            return -1
        }
        if (elemento == ("TESOURA")) {
            println("Você ganhou!!")
            return 1
        }
        println("Você empatou!!")
        return 0
    }
}