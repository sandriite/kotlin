fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true
}

fun main() {
    println(isPrime(7))  // true
    println(isPrime(10))  // false
}
