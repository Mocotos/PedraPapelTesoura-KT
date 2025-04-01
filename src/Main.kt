var pontos = 0

fun main() {
    println("Hello World!")
    do {
        println("1-Jogar!")
        println("2-PLACAR")
        println("3-SAIR")


        val opcao = readln()
        when (opcao.toInt()) {
            1 -> print("jogar")
            2 -> print("placar")
            3 -> print("saindo...")
        }
    } while (opcao != "0")
}

fun jogar() {
    println("Digite seu nickname: ")
    val nickname = readln()

    println("QUE OS JOGOS COMEÇEM")
    var rodadas = 1
    do {
        println("O que você quer jogar? ")
        println("Pedra, Papel ou Tesoura")

        var jogada = readln().uppercase()

        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = computador()

        when (jogada) {
            "PEDRA" -> {
                pontos = pedra.luta(movimentoPC)
            }
            "TESOURA" -> {
                pontos = tesoura.luta(movimentoPC)
            }
            "PAPEL" -> {
                pontos = papel.luta(movimentoPC)
            }

        }
        rodadas++
    }while (rodadas <= 3)
}

fun computador(): String {
    val movimento = (1..3).random()
    when (movimento) {
        1 -> return "TESOURA"
        2 -> return "PEDRA"
        3 -> return "PAPEL"


        else -> return ""
    }
}