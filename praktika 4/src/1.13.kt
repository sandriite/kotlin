fun main() {
    println("Введите код ошибки (100, 200, 300)")
    val errorCode = readln().toInt()

    when (errorCode) {
        100 -> println("Ошибка сети")
        200 -> println("Ошибка сервера")
        300 -> println("Ошибка доступа")
        else -> println("неизвестный код ошибки")
    }
}
