fun pyramid(n: Int) {
    for (i in 0 until n) {
        // Рассчитываем количество пробелов слева и справа от уровня
        val spaces = " ".repeat(n - i - 1)
        // Рассчитываем количество символов #
        val hashes = "#".repeat(2 * i + 1)
        // Выводим уровень пирамиды
        println("$spaces$hashes$spaces")
    }
}

fun main() {
    pyramid(1)
    println() // Для разделения выводов
    pyramid(2)
    println() // Для разделения выводов
    pyramid(3)
}
