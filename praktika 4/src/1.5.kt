fun main() {

    println("Введите число")
    val number = readln().toDouble()


    val result = when {
        number > 0 -> "Положительное число"
        number < 0 -> "Отрицательное число"
        else -> "Ноль"
    }
    println(result)
}
