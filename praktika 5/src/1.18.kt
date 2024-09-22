fun main() {

    println("введите высоту лестницы (N)")
    val n = readln().toInt()

    for (i in 1..n) {
        println("#".repeat(i)) // повторяем символ "#" i раз
    }
}
