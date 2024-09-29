import kotlin.random.Random

fun main() {
    val randomArray = IntArray(20) { Random.nextInt(1, 101) }  

    println("Массив случайных чисел: ${randomArray.joinToString(", ")}")
}
