fun findSecondMax(array: IntArray): Int? {
    if (array.size < 2) {
        return null // Если в массиве меньше 2 элементов, вернуть null
    }

    var max = Int.MIN_VALUE /* константа, представляющая минимальное возможное значение для типа Int, то есть -2,147,483,648.
    Она полезна в ситуациях, когда нужно установить начальное значение для переменной, которая будет искать максимальное или
    минимальное значение среди чисел, так как любое значение, которое вы можете встретить в массиве, будет больше, чем это значение.
    */
    var secondMax = Int.MIN_VALUE

    for (num in array) {
        if (num > max) {
            secondMax = max // Обновляем второй максимальный
            max = num // Обновляем максимальный
        } else if (num > secondMax && num < max) {
            secondMax = num // Обновляем второй максимальный, если текущий элемент меньше максимального и больше второго максимального
        }
    }

    return if (secondMax == Int.MIN_VALUE) null
    else {secondMax} // Проверка, был ли найден второй максимальный элемент
}

fun main() {
    val array = intArrayOf(3, 5, 1, 8, 7, 9, 9)

    val secondMax = findSecondMax(array)

    if (secondMax != null) {
        println("Второй по величине элемент: $secondMax")
    } else {
        println("Второй по величине элемент не найден.")
    }
}
