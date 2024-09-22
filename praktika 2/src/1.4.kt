fun main () {
    println("Введите число:")
    val pervoe: Float? = readLine()?.toFloatOrNull()
    println("Введите степень:")
    val vtoroe: Int? = readLine()?.toIntOrNull()

    var result: Float = 1F
    if (pervoe != null && vtoroe != null) {
        for (n  in 1..vtoroe){
        result *= pervoe
        }
        println("результат: $result")
    } else {
        println("Ошибка: введены некорректные числа!")
    }
}

