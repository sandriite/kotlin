fun main() {
    println("Введите число N:")
    val N = readln().toInt()

    var evenSum = 0
    var oddSum = 0

    for (i in 1..N) {
        if (i % 2 == 0) {
            evenSum += i // Сумма четных чисел
        } else {
            oddSum += i // Сумма нечетных чисел
        }
    }

    println("Сумма четных чисел от 1 до $N: $evenSum")
    println("Сумма нечетных чисел от 1 до $N: $oddSum")
}
