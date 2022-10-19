package study.example

fun main() {
    val set = hashSetOf(1, 7, 53, 7, 53, 52, 52)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println("set = $set")
    println("list = $list")
    println("map = $map")

    println(list.joinToString(";"))

    val aa = "abc"
    val lastIndex = aa.last()
    println("lastIndex = ${lastIndex}")

    val listOf = listOf(1, 2, 3)

    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

}
//fun main(args: Array<String>) {
//    val list = listOf("args: ", *args)
//    println(list)
//}
