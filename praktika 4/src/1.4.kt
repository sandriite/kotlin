fun main() {

    println("Введите час от 0 до 23")
    val hour = readln().toInt()


    val timeOfDay = when (hour) {
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..21 -> "Вечер"
        in 22..23, in 0..5 -> "Ночь"
        else -> "некорректное значение часа"
    }


    println("Время суток: $timeOfDay")
}
