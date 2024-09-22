fun main (){
    println("введите первое вещественное число: ")
    val chislo1 = readLine()!!.toDouble()
    println("введите второе вещественное число: ")
    val chislo2 = readLine()!!.toDouble()

    if(chislo1 > chislo2){
        println("$chislo1 > $chislo2")
    }
    else if (chislo2 > chislo1) {
        println("$chislo2 > $chislo1")
    }
    else {
        println("числа равны")
    }
}