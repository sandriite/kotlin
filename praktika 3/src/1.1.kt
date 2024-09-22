fun main() {
    println("Введите первое число: ")
    val number1 = readLine()!!.toInt()

    println("Введите второе число: ")
    val number2 = readLine()!!.toInt()

    println("Введите третье число: ")
    val number3 = readLine()!!.toInt()

    if (number1 > number2 && number1 > number3) {
        println("$number1 самое большое число")
    }
    else if (number2 > number1 && number2 > number3) {
        println("$number2 самое большое число")
    }
    else if (number3 > number1 && number3 > number2) {
        println("$number3 самое большое число")
    }
    else {
        println("чё")
    }
}