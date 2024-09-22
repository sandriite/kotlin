fun main() {
    println("введите букву выполняемого задания (а, б, в, г)")
    val bukva : String? = readLine() //String?


    when (bukva) {
        "а" -> {
            // Ввод числа
            print("Введите двузначное число: ")
            val number = readLine()?.toIntOrNull()
            //  . - это оператор вызова

            //  ?. — это оператор безопасного вызова.  используется для защиты от null.
            //  Если объект равен null, то операция просто пропускается и возвращается null`,
            //  что предотвращает возможные ошибки.

            //  если readline != null -> то toIntOrNull

            // Проверка, что введенное число двузначное
            if (number != null && number in 10..99) {
                // Находим число десятков
                val tens : Int = number / 10
                println("Число десятков: $tens")
            } else {
                println("Пожалуйста, введите корректное двузначное число.")
            }
        }

        "б" -> {
            print("Введите двузначное число: ")
            val number = readLine()?.toIntOrNull()

            if (number != null && number in 10..99) {
                // Находим число едениц
                val edenc = number % 10
                println("Число едениц: $edenc")
            } else {
                println("Пожалуйста, введите корректное двузначное число.")
            }
        }
        "в" -> {
            val number = readLine()?.toIntOrNull()
            var summa : Int = 0

            // Проверка, что введенное число двузначное
            if (number != null && number in 10..99) {
                // Находим число десятков
                val tens = number / 10
                val units = number % 10

                summa = tens + units
                println("сумма цифр в числе: $summa")
            } else {
                println("Пожалуйста, введите корректное двузначное число.")
            }
        }

        "г" -> {
            val number = readLine()?.toIntOrNull()
            var umnojenie : Int = 0

            // Проверка, что введенное число двузначное
            if (number != null && number in 10..99) {
                // Находим число десятков
                val tens = number / 10
                val units = number % 10

                umnojenie = tens * units
                println("произведение цифр в числе: $umnojenie")
            } else {
                println("Пожалуйста, введите корректное двузначное число.")
            }
        }

        else -> {
            println("вы ввели не то значение")
        }
    }
}
/*
val bukva : String? = readLine() //String?

 для получения ввода от пользователя, возвращаемое значение имеет тип [String?]
 то есть это может быть либо строка, либо null.

 можно ничо не писать в тип переменной
 функция readLine() всегда возращает тип [String?]


val number = readLine()?.toIntOrNull()
 toIntOrNull()
 преобразует строку в целое число, и возращает null если строка
 не может быть преобразована в число

 toInt
 реобразует строку в целое число, и выдает ошибку если невозможно
 преобразовать строку в целое число
 */
