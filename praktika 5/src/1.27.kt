fun main() {
    println("Введите число N:")
    val N = readln().toInt()

    for (i in 1..N) {
        // Вывод пробелов для выравнивания
        repeat(N - i) {
            print(" ")
        }

        // Вывод чисел от 1 до i
        for (j in 1..i) {
            print("$j ")
        }

        // Переход на следующую строку
        println()
    }
}
