fun main() {

    println("введите первое число")
    val a = readln().toInt()

    println("введите второе число")
    val b = readln().toInt()

    // переменные для вычисления нод
    var x = a
    var y = b

    // алгоритм Евклида для нахождения нод
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }

    println("нод чисел $a и $b равен $x")
}
