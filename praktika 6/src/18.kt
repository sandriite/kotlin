fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    val groupedArray = array.toList().chunked(5)  // Разбиваем массив на группы по 5 элементов

    for (group in groupedArray) {
        println(group)
    }
}
// array.toList().chunked(5) — преобразуем массив в список с помощью toList(), затем используем функцию chunked(5), чтобы разделить его на подсписки по 5 элементов.