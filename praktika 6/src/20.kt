fun arithmeticProgression(start: Int, difference: Int, size: Int): Array<Int> {
    val result = Array(size) { 0 }  // Создаем массив с указанным размером
    for (i in result.indices) {
        result[i] = start + i * difference  // Каждый следующий элемент прогрессии
    }
    return result
}

fun main() {
    val start = 2  // Начальный элемент
    val difference = 3  // Разность прогрессии
    val size = 10  // Количество элементов

    val progressionArray = arithmeticProgression(start, difference, size)

    println("Арифметическая прогрессия: ${progressionArray.joinToString(", ")}")
}

/*
arithmeticProgression — функция для создания арифметической прогрессии:
start — первый элемент прогрессии.
difference — разность между элементами.
size — количество элементов в массиве.
Каждый элемент вычисляется по формуле: start + i * difference, где i — индекс элемента.
main() — задаём параметры для арифметической прогрессии и выводим её на экран.
*/
