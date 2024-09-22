fun main() {
    println("Введите число N:")
    val N = readln().toInt()

    var sum = 0.0

    // Вычисление суммы ряда
    for (i in 1..N) {
        sum += 1.0 / i // Добавляем 1/i к сумме
    }
    
    println("Сумма ряда от 1 до $N: $sum")
}
