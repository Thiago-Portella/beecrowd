package gpt.challenges

fun main() {
    val number = readln().toInt()
    println("${number}! = ")
    for (it in number downTo 1) {
        print("${number * it}, ")
    }
}