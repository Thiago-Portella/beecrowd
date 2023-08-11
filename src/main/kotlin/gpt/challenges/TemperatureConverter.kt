package gpt.challenges

fun celsiusToFahrenheit(celsius: Double): Double {
    val fahrenheit = celsius * 9/5 + 32
    return fahrenheit
}

fun main() {
    println(
        celsiusToFahrenheit(readln().toDouble())
    )
}
