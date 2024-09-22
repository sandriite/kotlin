fun main() {

    println("введите первую строку")
    val firstString = readln()

    println("введите вторую строку")
    val secondString = readln()

    //удаление пробелов и приведение к нижнему регистру
    val normalizedStr1 = firstString.replace(" ", "").lowercase()
    val normalizedStr2 = secondString.replace(" ", "").lowercase()

    //проверка длины строк
    if (normalizedStr1.length != normalizedStr2.length) {
        println("cтроки не являются анаграммами.")
        return
    }

    // преобразование строк в массивы символов и сортировка
    val sortedStr1 = normalizedStr1.toCharArray().sortedArray()
    val sortedStr2 = normalizedStr2.toCharArray().sortedArray()

    // сравнение отсортированных массивов
    if (sortedStr1 contentEquals sortedStr2) {
        println("cтроки \"$firstString\" и \"$secondString\" являются анаграммами")
    } else {
        println("cтроки \"$firstString\" и \"$secondString\" не являются анаграммами")
    }
}
//help