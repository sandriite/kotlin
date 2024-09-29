fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    val divisibleBy3 = array.filter { it % 3 == 0 }

    println("Числа, делящиеся на 3: $divisibleBy3")
}
