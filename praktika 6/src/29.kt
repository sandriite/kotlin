fun findMedian(array: IntArray): Double {
    if (array.isEmpty()) return 0.0

    val sortedArray = array.sortedArray()
    val mid = sortedArray.size / 2

    return if (sortedArray.size % 2 == 0) {
        (sortedArray[mid - 1] + sortedArray[mid]) / 2.0 // Среднее двух центральных элементов
    } else {
        sortedArray[mid].toDouble() // Центральный элемент
    }
}

fun main() {
    val numbers = intArrayOf(3, 1, 4, 2, 5)

    val median = findMedian(numbers)
    println("Медиана: $median")
}
