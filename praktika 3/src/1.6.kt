fun main (){
    println("Введите год: ")
    val god = readLine()!!.toInt()

    val vesokos : Boolean = (god % 4 == 0 && god % 100 != 0) || (god % 400 == 0)

    if (vesokos == true) {
        println("$god - високосный год")
        println("Количество дней в году: 366")
    } else {
        println("$god - не високосный год")
        println("Количество дней в году: 365")
    }
}