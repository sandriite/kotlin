fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)

    val concatenatedArray = array1 + array2

    println("Объединённый массив: ${concatenatedArray.joinToString("; ")}") //выводит объединённый массив в виде строки с разделением через запятую для удобства чтения
}
