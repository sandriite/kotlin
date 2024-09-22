fun main() {
    print("Введите трехзначное число: ")
    val number = readLine()?.toIntOrNull()

    // Проверка, что введенное число трехзначное
    if (number != null && number in 100..999) {
        var summa = 0
        var mnoj = 0
        // Находим число десятков
        val tens = number / 10
        //находим число едениц
        val edenc = number % 10

        val odin = tens / 10
        val dva = tens % 10

        summa = odin + dva + edenc
        mnoj = odin * dva * edenc

        println("а) в $number находится $edenc едениц")
        println("б) в $number находится $tens десятков")
        println("в) в $number сумма цифр $summa")
        println("г) в $number произведение цифр $mnoj")

    } else {
        println("Пожалуйста, введите корректное трехзначное число.")
    }


}