import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()-_=+<>?"
    val password = StringBuilder()

    repeat(length) {
        val randomIndex = Random.nextInt(chars.length)
        password.append(chars[randomIndex])
    }

    return password.toString()
}

fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()

    if (length < 1) {
        println("Длина пароля должна быть больше 0.")
        return
    }

    val generatedPassword = generatePassword(length)

    println("Сгенерированный пароль: $generatedPassword")
}
