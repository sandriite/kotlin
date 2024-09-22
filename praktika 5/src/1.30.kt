fun main() {
    println("введите целое число:")
    val number = readln().toInt()

    // конвертация в двоичную систему
    val binaryString = number.toString(2)

    println("число $number в двоичной системе: $binaryString")
}
