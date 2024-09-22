fun main() {

    println("введите строку")
    val input = readln()

    // удаление пробелов и приведение к нижнему регистру
    val normalizedString = input.replace(" ", "").lowercase()

    // проверка на палиндром
    val palindrom = normalizedString == normalizedString.reversed()


    if (palindrom) {
        println("\"$input\" является палиндромом")
    } else {
        println("\"$input\" не является палиндромом")
    }
}
