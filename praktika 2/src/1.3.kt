fun main () {
    println("Введите первое число:")
    val pervoe: Float? = readLine()?.toFloatOrNull()
    println("Введите второе число:")
    val vtoroe: Float? = readLine()?.toFloatOrNull()

    if (pervoe != null && vtoroe != null) {
        if (vtoroe != 0F) {
            val result: Float = pervoe / vtoroe
            println("Результат: $result")
        } else {
            println("Ошибка: деление на ноль невозможно!")
        }
    } else {
        println("Ошибка: введены некорректные числа!")
    }
}

