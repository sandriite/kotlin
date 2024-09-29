fun calculateAverage(array: IntArray): Double {
    if (array.isEmpty()) return 0.0 // Если массив пустой, возвращаем 0

    val sum = array.sum() // Находим сумму всех элементов
    return sum.toDouble() / array.size // Вычисляем среднее арифметическое
}

fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 50)

    val average = calculateAverage(numbers)

    println("Среднее арифметическое: $average")
}
