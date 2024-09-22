fun main() {

    println("Введите двузначное число:")
    val number = readLine()!!.toInt()


    if (number in 10..99 || number in -99..-10) {

        val firstDigit = Math.abs(number) / 10 // Первая цифра
        val secondDigit = Math.abs(number) % 10 // Вторая цифра


        if (firstDigit > secondDigit) {
            println("Первая цифра $firstDigit больше второй цифры $secondDigit")
        } else if (firstDigit < secondDigit) {
            println("Вторая цифра $secondDigit больше первой цифры $firstDigit")
        } else {
            println("Цифры $firstDigit и $secondDigit одинаковы")
        }
    } else {
        println("введите двузначное число")
    }
}
