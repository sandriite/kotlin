fun main() {

    println("введите первую строку")
    val firstString = readln()

    println("введите вторую строку")
    val secondString = readln()

    //удаление пробелов и приведение к нижнему регистру
    val normalizedStr1 = firstString.replace(" ", "").lowercase()
    val normalizedStr2 = secondString.replace(" ", "").lowercase()

    // Проверка длины строк
    if (normalizedStr1.length != normalizedStr2.length) {
        println("Строки не являются анаграммами.")
        return
    }

    //создание массива для подсчета частот символов
    val charCount = IntArray(26)

    //подсчет символов в первой строке
    for (char in normalizedStr1) {
        charCount[char - 'a']++
    }

    // уменьшение счетчиков по второй строке
    for (char in normalizedStr2) {
        charCount[char - 'a']--
    }

    // проверка, все ли счетчики равны нулю
    val areAnagrams = charCount.all { it == 0 }


    if (areAnagrams) {
        println("Строки \"$firstString\" и \"$secondString\" являются анаграммами")
    } else {
        println("Строки \"$firstString\" и \"$secondString\" не являются анаграммами")
    }
}
