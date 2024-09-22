fun main () {

    println("введите ЦЕЛОЕ число m")
    val m = readLine()!!.toDouble()

    println("введите ЦЕЛОЕ число n")
    val n = readLine()!!.toDouble()

    //проверка, являются ли числа целыми
    if ((m == m.toInt().toDouble()) && (n == n.toInt().toDouble())) {
        //деление
        if (m % n == 0.0) {
            println("частное $m и $n = " + m/n)
        }
        else  {
            println("m на n нацело не делится")
        }
    }
    else {
        print("одно из чисел или числа не целые")
    }
}