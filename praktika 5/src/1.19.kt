fun main() {
    // исходный массив двухзначных чисел
    val numbers = intArrayOf(34, 12, 56, 23, 45, 67, 89, 11, 22, 99)

    //вывод исходного массива
    println("исходный массив: ${numbers.joinToString(", ")}")

    // сортировка массива методом выбора
    for (i in numbers.indices) {
        var minIndex = i
        for (j in (i + 1)..(numbers.lastIndex)) {
            if (numbers[j] < numbers[minIndex]) {
                minIndex = j
            }
        }
        // меняем местами минимальный элемент с текущим
        if (minIndex != i) {
            val temp = numbers[i]
            numbers[i] = numbers[minIndex]
            numbers[minIndex] = temp
        }
    }

    println("отсортированный массив: ${numbers.joinToString(", ")}")
}
