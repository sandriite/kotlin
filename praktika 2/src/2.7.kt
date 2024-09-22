fun main() {
    val A: Boolean = true
    val B: Boolean = false
    val C: Boolean = false
    val odin = A or !(A and B) or C
    val dva = !A or A and (B or C)
    val tri = (A or B and !C) and C

    println("A or !(A and B) or C = $odin")
    println("!A or A and (B or C) = $dva")
    println("!A or A and (B or C) = $tri")

}
