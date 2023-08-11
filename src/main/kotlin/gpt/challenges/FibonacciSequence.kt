package gpt.challenges

fun generateFibonacciSequence(n: Int): List<Long> {
    val fibonacciSequence = mutableListOf<Long>()

    var prev = 0L
    var current = 1L

    for (i in 1..n) {
        fibonacciSequence.add(prev)
        val next = prev + current
        prev = current
        current = next
    }

    return fibonacciSequence
}

fun main() {
    print("Digite o valor de N: ")
    val n = readlnOrNull()?.toIntOrNull()

    if (n != null && n > 0) {
        val fibonacciList = generateFibonacciSequence(n)
        println("Os primeiros $n números da sequência de Fibonacci são: $fibonacciList")
    } else {
        println("Por favor, insira um valor válido maior que zero.")
    }
}
