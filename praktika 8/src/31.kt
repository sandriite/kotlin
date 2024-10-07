fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun main() {
    println(celsiusToFahrenheit(0.0))  // 32.0
    println(celsiusToFahrenheit(100.0))  // 212.0
}
