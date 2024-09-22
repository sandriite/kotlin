fun main() {
    println("Введите число a:")
    val a = readLine()!!.toInt()

    println("Введите число b:")
    val b = readLine()!!.toInt()

    
    if (b % a == 0) {
        println("Число $a является делителем числа $b")
    } else {
        println("Число $a не является делителем числа $b")
    }
}
