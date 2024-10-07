fun sumElements(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println("Сумма элементов списка: ${sumElements(list)}")
}
