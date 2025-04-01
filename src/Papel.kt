class Papel {
    var pontos: Int = 0
    fun luta(elemento: String) : Int{
        if (elemento == ("TESOURA")) {
            println("Você perdeu!!")
            return -1
        }
        if (elemento ==("PEDRA")) {
            println("Você ganhou!!")
            return 1
        }
        println("Você empatou!!")
        return 0
    }
}
