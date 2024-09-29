fun mergeArrays(vararg arrays: IntArray): IntArray {
    // Создаем новый массив с общей длиной всех входящих массивов
    val totalSize = arrays.sumOf { it.size }
    val mergedArray = IntArray(totalSize)

    var index = 0
    for (array in arrays) {
        for (num in array) {
            mergedArray[index] = num // Копируем элементы в объединенный массив
            index++
        }
    }

    return mergedArray
}

fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)

    val mergedArray = mergeArrays(array1, array2, array3)

    println("Объединенный массив: ${mergedArray.joinToString(", ")}")
}
