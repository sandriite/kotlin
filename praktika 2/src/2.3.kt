
fun main() {
    val A: Boolean = true
    val B: Boolean = false
    val C: Boolean = false

    val odin = !A and B
    val dva = A or !B
    val tri = A and B or C

    println("!A and B = $odin")
    println("A or !B = $dva")
    println("A and B or C = $tri")
}
