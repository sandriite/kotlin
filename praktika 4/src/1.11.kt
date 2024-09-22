fun main() {
    println("Введите группу крови (A, B, AB, O)")
    val bloodGroup = readln().uppercase() //в большие букввы

    when (bloodGroup) {
        "A" -> println("Для переливания подходят: A, O")
        "B" -> println("Для переливания подходят: B, O")
        "AB" -> println("Для переливания подходят: A, B, AB, O (универсальный получатель)")
        "O" -> println("Для переливания подходит только O (универсальный донор)")
        else -> println("неверная группа крови")
    }
}
