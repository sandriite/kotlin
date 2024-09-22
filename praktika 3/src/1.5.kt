fun main() {
    println("Введите длинну первой стороны: ")
    val number1 = readLine()!!.toInt()

    println("Введите длинну второй стороны: ")
    val number2 = readLine()!!.toInt()

    println("Введите длинну третей стороны: ")
    val number3 = readLine()!!.toInt()

    if (number1 > (number2 + number3) || number2 > (number1 + number3) || number3 > (number1 + number2)) {
    print("треугольника не существует")
    }
    else {
        print("треугольник существует")
    }
}