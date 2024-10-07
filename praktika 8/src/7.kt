fun isDivisibleBy100(num: Int): Boolean {
    return num % 100 == 0
}

fun main() {
    println("Число делится на 100: ${isDivisibleBy100(300)}")
}
