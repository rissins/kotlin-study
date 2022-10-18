import study.example.Color
import study.example.smart_cast.Expr
import study.example.smart_cast.Num
import study.example.smart_cast.Sum

fun main() {
    //print Hello World
    println("Hello World")
    val max = max(3, 5)
    println("max = $max")
    val shortMax = shortMax(3, 5)
    println("shortMax = $shortMax")
    val color = Color.BLUE
    val mnemonic = getMnemonic(color)
    println("mnemonic = $mnemonic")

    for (i in 1..100) {
        println(i)
    }

    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}

//함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun shortMax(a: Int, b: Int): Int = if (a > b) a else b

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1,c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 불필요한 과정 (Smart Cast에 의해 자동으로 타입 구분)
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left) // Smart Cast에 의해 e는 Sum 타입으로 식별됨
    }
    throw IllegalArgumentException("Unknown expression")
}
