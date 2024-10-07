fun google(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}

fun main() {
    println(google(5))  // "Gooooogle"
    println(google(0))  // "Ggle"
    println(google(2))  // "Google"
}
