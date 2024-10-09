fun printNumber(n: Int): List<Int> {
    return if (n <= 0) {
        emptyList() // Возвращаем пустой список, если n равно 0 или меньше
    } else {
        (n downTo 1).toList() // Генерируем список от n до 1
    }
}

fun main() {
    println(printNumber(0)) // []
    println(printNumber(2)) // [2, 1]
    println(printNumber(5)) // [5, 4, 3, 2, 1]
}
