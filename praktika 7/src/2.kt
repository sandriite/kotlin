fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace("\\s".toRegex(), "").lowercase() // Убираем пробелы и приводим к нижнему регистру
    return cleanedWord == cleanedWord.reversed()
}

fun main() {
    val word = "Радар" // Пример слова
    if (isPalindrome(word)) {
        println("Слово '$word' является палиндромом")
    } else {
        println("Слово '$word' не является палиндромом")
    }
}

