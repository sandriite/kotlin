fun main() {

    println("Введите натуральное число:")
    val number = readLine()!!.toInt()


    if (number % 2 == 0) {
        println("Число $number является четным")
    } else {
        println("Число $number не является четным")
    }


    if (number % 10 == 7) {
        println("Число $number оканчивается на 7")
    } else {
        println("Число $number не оканчивается на 7")
    }
}
