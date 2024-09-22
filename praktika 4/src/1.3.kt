fun main() {

    println("Введите баллы от 0 до 100")
    val bal = readln().toInt()


    val result = when (bal) {
        in 90..100 -> "Отлично"
        in 75..89 -> "Хорошо"
        in 60..74 -> "Удовлетворительно"
        in 40..59 -> "Плохо"
        in 0..39 -> "Очень плохо"
        else -> "а"
    }

    println("Оценка: $result")
}
