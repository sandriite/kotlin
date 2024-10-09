import kotlin.random.Random

fun main() {
    val targetNumber = Random.nextInt(1, 101) // Генерация случайного числа от 1 до 100
    var guess: Int? = null

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте угадать!")

    while (guess != targetNumber) {
        println("Введите ваш вариант:")
        guess = readln().toInt()

        when {
            guess < targetNumber -> println("Загаданное число больше.")
            guess > targetNumber -> println("Загаданное число меньше.")
            else -> println("Поздравляем! Вы угадали число $targetNumber.")
        }
    }
}
