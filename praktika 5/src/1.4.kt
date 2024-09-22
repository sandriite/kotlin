fun main() {
    println("Введите число для вычисления факториала")
    val number = readln().toInt()

    var factorial = 1L //L указывает, что это число типа Long
    for (i in 1..number) {
        factorial *= i
    }

    println("Факториал числа $number равен $factorial")
}
