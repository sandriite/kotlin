fun main() {
println("Введите первое число: ")
    val number1 = readLine()!!.toInt()

    println("Введите второе число: ")
    val number2 = readLine()!!.toInt()

    val boo1 = number1 % 2
    val boo2 = number2 % 2

    if (boo1 != 0){
    print("$number1 нечётное")
    }
    else if (boo2 != 0){
        print("$number2 нечётное")
    }
    else {
        print("чо")
    }
}