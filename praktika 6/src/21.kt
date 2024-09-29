//массивы имеют фиксированный размер, поэтому нужно создать новый массив, в который будут скопированы все элементы, кроме удаляемого

fun removeElement(array: Array<Int>, element: Int): Array<Int> {
    // Сначала создаем список для новых элементов
    val resultList = mutableListOf<Int>()

    // Проходим по всем элементам исходного массива
    for (item in array) {
        // Если элемент не равен удаляемому, добавляем его в новый список
        if (item != element) {
            resultList.add(item)
        }
    }

    // Преобразуем список обратно в массив и возвращаем его
    return resultList.toTypedArray()
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 3, 6)
    val elementToRemove = 3

    val newArray = removeElement(array, elementToRemove)

    println("Исходный массив: ${array.joinToString(", ")}")
    println("Массив после удаления элемента $elementToRemove: ${newArray.joinToString(", ")}")
}
