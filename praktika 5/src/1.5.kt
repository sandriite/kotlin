fun main() {

    println("введите число")
    val number = readln().toInt()


    if (number < 2) {
        println("$number не является простым числом")
        return //выход из функции main, ничего не возращаем
    }

    var isPrime = true


    for (i in 2..<number) {
        if (number % i == 0) {
            isPrime = false
            break // выходим из цикла если нашли делитель
        }
    }

    if (isPrime) {
        println("$number является простым числом")
    } else {
        println("$number не является простым числом")
    }
}
