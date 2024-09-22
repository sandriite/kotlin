fun main() {
    println("Введите четырехзначное число:")
    val number = readLine()!!.toInt()

    if (number in 1000..9999) {
        // Получение цифр
        val thousands = number / 1000
        val hundreds = (number / 100) % 10
        val tens = (number / 10) % 10
        val units = number % 10

        // а) Сравниваем сумму двух первых и двух последних цифр
        val sumFirstTwo = thousands + hundreds
        val sumLastTwo = tens + units
        if (sumFirstTwo == sumLastTwo) {
            println("Сумма двух первых цифр равна сумме двух последних цифр")
        } else {
            println("Сумма двух первых цифр не равна сумме двух последних цифр")
        }

        // б) Проверяем, кратна ли трем сумма цифр
        val sumAllDigits = thousands + hundreds + tens + units
        if (sumAllDigits % 3 == 0) {
            println("Сумма цифр кратна 3")
        } else {
            println("Сумма цифр не кратна 3")
        }

        // в) Проверяем, кратно ли четырем произведение цифр
        val mnojAllDigits = thousands * hundreds * tens * units
        if (mnojAllDigits % 4 == 0) {
            println("Произведение цифр кратно 4")
        } else {
            println("Произведение цифр не кратно 4")
        }

        // г) Проверяем, кратно ли произведение цифр числу a
        println("Введите число a:")
        val a = readLine()!!.toInt()
        if (mnojAllDigits % a == 0) {
            println("Произведение цифр кратно числу $a")
        } else {
            println("Произведение цифр не кратно числу $a")
        }
    } else {
        println("введите четырехзначное число")
    }
}
