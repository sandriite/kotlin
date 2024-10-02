import kotlin.random.Random

fun drawCard(): Int {
    val card = Random.nextInt(1, 11) // Карта может быть от 1 до 10
    println("Вам выпала карта: $card")
    return card
}

fun computerDrawCard(): Int {
    val card = Random.nextInt(1, 11) // Карта может быть от 1 до 10
    println("Компьютер вытянул карту: $card")
    return card
}

fun main() {
    var playerScore = 0
    var computerScore = 0

    println("Игра '21' началась!")

    // Ход игрока
    while (true) {
        println("Ваши очки: $playerScore")
        println("Хотите взять карту? (да/нет)")
        val answer = readln()
        if (answer.lowercase() == "да") {
            playerScore += drawCard()
            if (playerScore > 21) {
                println("У вас $playerScore очков. Вы проиграли!")
                return
            }
        } else {
            break
        }
    }

    // Ход компьютера
    while (computerScore < 17) { // Компьютер тянет карту, пока его очки меньше 17
        computerScore += computerDrawCard()
    }
    println("Очки компьютера: $computerScore")

    // Определение победителя
    if (computerScore > 21 || playerScore > computerScore) {
        println("Вы победили с $playerScore очками!")
    } else if (playerScore == computerScore) {
        println("Ничья! У обоих $playerScore очков.")
    } else {
        println("Компьютер победил с $computerScore очками.")
    }
}
