fun areAnagrams(str1: String, str2: String): Boolean {
    // Приводим обе строки к нижнему регистру и убираем пробелы
    val normalizedStr1 = str1.lowercase().replace("\\s".toRegex(), "")
    val normalizedStr2 = str2.lowercase().replace("\\s".toRegex(), "")

    // Сравниваем отсортированные символы обеих строк
    return normalizedStr1.toCharArray().sorted() == normalizedStr2.toCharArray().sorted()
}

fun main() {
    println("Введите первую строку:")
    val str1 = readln()

    println("Введите вторую строку:")
    val str2 = readln()

    if (areAnagrams(str1, str2)) {
        println("Строки являются анаграммами")
    } else {
        println("Строки не являются анаграммами")
    }
}
