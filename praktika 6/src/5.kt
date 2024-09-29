fun main() {
    val array = arrayOf(1, 2, 2, 3, 4, 4, 5)
    val result = mutableListOf<Int>()

    for (i in array.indices) {
        var isUnique = true //Переменная isUnique инициализируется внутри внешнего цикла перед проверкой каждого элемента. Поэтому её значение сбрасывается на true каждый раз, когда переходим к следующему элементу массива. Это гарантирует, что для каждого элемента мы начинаем проверку с чистого состояния.
        for (j in array.indices) {
            if (array[i] == array[j] && i != j) {
                isUnique = false
                break
            }
        }
        if (isUnique) {
            result.add(array[i])
        }
    }


    println("Уникальные элементы: $result")
}
