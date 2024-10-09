fun swapCase(input: String): String {
    val swappedString = StringBuilder()

    for (char in input) {
        if (char.isUpperCase()) {
            swappedString.append(char.lowercaseChar())
        } else {
            swappedString.append(char.uppercaseChar())
        }
    }

    return swappedString.toString()
}

fun main() {
    println("Введите строку:")
    val input = readln()

    val result = swapCase(input)

    println("Строка с изменённым регистром: $result")
}
