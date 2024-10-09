fun sortStrings(arr: Array<String>): Array<String> {
    return arr.sortedArray() // Функция для сортировки массива строк по алфавиту
}

fun main() {
    val strings = arrayOf("яблоко", "банан", "груша", "апельсин", "ананас")

    println("Исходный массив:")
    println(strings.joinToString(", "))

    val sortedStrings = sortStrings(strings)

    println("Отсортированный массив:")
    println(sortedStrings.joinToString(", "))
}
