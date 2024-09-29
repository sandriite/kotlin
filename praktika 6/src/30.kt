fun main() {
    val numbers = IntArray(100) { (1..100).random() } // Создаем массив из 100 случайных чисел

    println("Сгенерированный массив: ${numbers.joinToString(", ")}")

    // Разделяем на группы по 10 элементов
    for (i in numbers.indices step 10) {
        val group = numbers.sliceArray(i until (i + 10).coerceAtMost(numbers.size))
        println("Группа ${i / 10 + 1}: ${group.joinToString(", ")}")
    }
}
