fun linearSearch(array: IntArray, target: Int): Boolean {
    for (element in array) {
        if (element == target) {
            return true // Элемент найден
        }
    }
    return false // Элемент не найден
}

fun main() {
    val array = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)
    val target = 7

    val found = linearSearch(array, target)

    if (found) {
        println("Элемент $target найден в массиве.")
    } else {
        println("Элемент $target не найден в массиве.")
    }
}
