fun main() {
    println("Введите первое БОЛЬШЕЕ число: ")
    val number1 = readLine()!!.toDouble()

    println("ВВЕДИТЕ ВТОРОЕ меньшее ЧИСЛО" +
            ": ")
    val number2 = readLine()!!.toDouble()

    val result : Double = number1 % number2

    if (number1 > number2) {
        if (result == 0.0) {
        println("$number1 кратно $number2")
        }
    else {
            println("$number1 НЕ кратно $number2, остаток: $result")
        }
    }
    else {
        print("первое число не больше второго")
    }
 }