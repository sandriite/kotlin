import kotlin.system.exitProcess

fun main () {
    println("введите километры")
    val kilometers = readLine()!!.toDouble()
    println("введите футы")
    val futs = readLine()!!.toDouble()

    if (kilometers < futs*0.305){
        println("километры меньше")
    }
    else if (futs*0.305 < kilometers){
        println("футы меньше")
    }
    else {
        println("одинаковые")
    }
}