fun main() {

    println("Введите число")
    val number = readln().toInt()

    when(number){
        234 -> println("число угадано")
        else -> println("число не угадано")
    }
}
