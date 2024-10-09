fun caesarCipher(text: String, shift: Int): String {
    val result = StringBuilder()
    val normalizedShift = shift % 26 // Нормализуем сдвиг в пределах 26 букв

    for (char in text) {
        when {
            char.isUpperCase() -> {
                // Шифрование для заглавных букв
                val shiftedChar = ((char.code - 'A'.code + normalizedShift) % 26 + 'A'.code).toChar()
                result.append(shiftedChar)
            }
            char.isLowerCase() -> {
                // Шифрование для строчных букв
                val shiftedChar = ((char.code - 'a'.code + normalizedShift) % 26 + 'a'.code).toChar()
                result.append(shiftedChar)
            }
            else -> {
                // Неизменяем символы, не являющиеся буквами
                result.append(char)
            }
        }
    }

    return result.toString()
}

fun main() {
    println("Введите текст для шифрования:")
    val inputText = readln()

    println("Введите ключ (сдвиг):")
    val shift = readln().toInt()

    val encryptedText = caesarCipher(inputText, shift)
    println("Зашифрованный текст: $encryptedText")

    // Дешифрование
    val decryptedText = caesarCipher(encryptedText, -shift)
    println("Дешифрованный текст: $decryptedText")
}
