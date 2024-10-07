fun frames(minutes: Int, fps: Int): Int {
    return minutes * fps * 60
}

fun main() {
    println("Кадры за указанное время: ${frames(2, 30)}")
}
