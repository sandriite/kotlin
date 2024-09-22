fun main() {

    println("Введите строку")
    val inputString = readln()

    // Определение длины строки
    val lengthOfString = inputString.length


    when (lengthOfString) {
        0 -> println("Строка пустая.")
        in 1..5 -> println("Короткая строка (длина: $lengthOfString символов)")
        in 6..10 -> println("Средняя строка (длина: $lengthOfString символов)")
        else -> println("Длинная строка (длина: $lengthOfString символов)")
    }
}
