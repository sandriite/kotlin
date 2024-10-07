fun isPowerEqualsN(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
}

fun main() {
    println("k^k == n: ${isPowerEqualsN(81, 3)}")
}
