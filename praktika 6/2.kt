fun main (){
    val bebra = arrayOf(1, 2, 3, 4, 5)
    var sum = 0

    for (char in bebra) {
        sum += char
    }
    print("Сумма чисел массива $sum")
}