
fun main() {
    val X: Boolean = false
    val Y: Boolean = true
    val Z: Boolean = false

    val odin = X or Z
    val dva = X and Y
    val tri = X and Z

    println("X or Z = $odin")
    println("X and Y = $dva")
    println("X and Z = $tri")
}