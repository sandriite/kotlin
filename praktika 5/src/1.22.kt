import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guessedNumber: Int
    var attempts = 0

    println("Угадайте число от 1 до 100:")

    while (true) {
        println("Введите ваше число:")
        guessedNumber = readln().toInt()
        attempts++

        if (guessedNumber == randomNumber) {
            println("Вы угадали число $randomNumber за $attempts попыток")
            break
        }
    }
}
