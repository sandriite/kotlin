fun diffMaxMin(list: List<Int>): Int {
    val max = list.maxOrNull() ?: 0
    val min = list.minOrNull() ?: 0
    return max - min
}

fun main() {
    val list = listOf(10, 15, 3, 20, 7)
    println("Разность самого большого и самого маленького: ${diffMaxMin(list)}")
}
