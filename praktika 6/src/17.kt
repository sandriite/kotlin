fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)

    val sum = array.sum()  // Сумма всех элементов массива
    val product = array.reduce { acc, element -> acc * element }  // Произведение всех элементов массива

    println("Сумма элементов массива: $sum")
    println("Произведение элементов массива: $product")
}
/* array.reduce { acc, element -> acc * element } — это функция, которая последовательно перемножает элементы массива.
acc — это аккумулятор, который хранит промежуточное произведение, а element — текущий элемент массива.
 */