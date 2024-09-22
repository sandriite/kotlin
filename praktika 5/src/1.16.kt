fun main() {
    // ввод числа N
    println("введите число N")
    val n = readln().toInt()

    var sumOfSquares = 0

    // цикл от 1 до N
    for (i in 1..n) {
        sumOfSquares += i * i // добавление квадрата текущего числа к сумме
    }
    
    println("Сумма квадратов всех чисел от 1 до $n равна: $sumOfSquares")
}
