fun main() {
    println("введите число")
    val input = readln()

    // переменная для хранения суммы цифр
    var sum = 0

    // цикл для прохода по каждой цифре строки
    for (char in input) {
        if (char.isDigit()) { // проверяем, является ли символ цифрой
            sum += char.toString().toInt() // преобразуем символ в цифру и добавляем к сумме
        }
    }

    println("сумма цифр числа: $sum")
}
