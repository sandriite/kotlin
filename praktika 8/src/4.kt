fun isProfitable(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    println("Проверка prob * prize > pay: ${isProfitable(0.5, 100.0, 40.0)}")
}
