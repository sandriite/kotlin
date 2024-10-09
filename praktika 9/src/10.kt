fun findLongestWord(input: String): String {
    // Удаляем знаки препинания и разбиваем строку на слова
    val words = input.replace(Regex("[^A-Za-zА-Яа-я\\s]"), "").split("\\s+".toRegex())

    // Инициализируем переменные для хранения самого длинного слова
    var longestWord = ""

    // Проходим по каждому слову
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    return longestWord
}

fun main() {
    println("Введите строку:")
    val input = readln()

    val longestWord = findLongestWord(input)

    println("Самое длинное слово: $longestWord")
}
