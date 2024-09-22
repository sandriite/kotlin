import kotlin.math.sqrt

fun main() {
    print("Введите число: ")
    val number = readLine()?.toDoubleOrNull()

    if (number != null) {
        val koren = sqrt(number)
        println("Квадратный корень из $number равен $koren")
    }

    else {
        print("введите хоть что то")
    }
}