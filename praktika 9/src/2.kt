fun main() {
    println("Введите строку:")
    val input = readln().lowercase() // Чтение строки и преобразование к нижнему регистру

    var vowelsCount = 0
    var consonantsCount = 0

    // Определяем множества гласных и согласных букв
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    val consonants = setOf(
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
        'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'
    )

    for (char in input) {
        if (char in vowels) {
            vowelsCount++
        } else if (char in consonants) {
            consonantsCount++
        }
    }

    println("Количество гласных: $vowelsCount")
    println("Количество согласных: $consonantsCount")
}
