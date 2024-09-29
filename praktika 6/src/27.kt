fun maxSequence(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) return Pair(0, 0) // Если массив пустой, возвращаем 0

    var maxCount = 1
    var currentCount = 1
    var maxElement = array[0]

    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentCount++ // Увеличиваем текущий счетчик
        } else {
            if (currentCount > maxCount) {
                maxCount = currentCount // Обновляем максимальный счетчик
                maxElement = array[i - 1] // Запоминаем элемент
            }
            currentCount = 1 // Сбрасываем текущий счетчик
        }
    }

    // Проверяем последнюю последовательность
    if (currentCount > maxCount) {
        maxCount = currentCount
        maxElement = array[array.size - 1]
    }

    return Pair(maxElement, maxCount)
}

fun main() {
    val numbers = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5)

    val (element, count) = maxSequence(numbers)
    println("Максимальная последовательность: $element, количество: $count")
}
