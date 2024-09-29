fun main() {
    println("Введите количество элементов в массиве:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)

    println("Введите $size чисел через пробел:")
    val input = readLine()!!.split(" ")

    for (i in 0 until size) {
        numbers[i] = input[i].toInt()
    }

    println("Вы ввели массив: ${numbers.joinToString(", ")}")
}
