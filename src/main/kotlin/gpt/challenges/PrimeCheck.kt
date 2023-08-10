package gpt.challenges

import kotlin.math.sqrt

fun main() {
    println(
        isPrime(readln().toInt())
    )
}

fun isPrime(number: Int): String {
    val squareRoot = sqrt(number.toDouble()).toInt()

    return if (number <= 1) {
        "O número $number é menor ou igual a 1, portanto não pode ser primo."
    } else {
        for (it in 2..squareRoot) {
            val module = number % it
            if (module == 0) {
                return "O número $number não é primo, pois é divisível por $it."
            }
        }
        "O número $number é primo, pois só pode ser dividido por 1 e ele mesmo."
    }
}
