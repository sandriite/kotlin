fun main() {

    println("введите еду")
    val eat = readln()

    when(eat){
        "курица" -> println("20 минут")
        "рыба" -> println("30 минут")
        "вареники" -> println("12 минут")
    }
}