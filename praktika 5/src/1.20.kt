fun main() {
    // ввод начального и конечного значений диапазона
    println("введите начальное значение диапазона")
    val start = readln().toInt()
    println("введите конечное значение диапазона")
    val end = readln().toInt()

    // вывод простых чисел в диапазоне
    println("простые числа в диапазоне от $start до $end:")
    for (number in start..end) {
        if (number < 2) continue // пропускаем числа меньше 2

        var isPrime = true
        for (i in 2..kotlin.math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println(number)
        }
    }
}
