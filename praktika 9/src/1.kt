import kotlin.random.Random

fun main() {
    repeat(10) {
        val randomNumber = Random.nextInt(1, 101) // Диапазон от 1 до 100 включительно
        println(randomNumber)
    }
}
