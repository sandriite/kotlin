import kotlin.random.Random

fun main() {
    println("случайные числа:")
    for (i in 1..10) {
        val randomNumber = Random.nextInt(1, 101) // генерация случайного числа от 1 до 100
        println(randomNumber)
    }
}
