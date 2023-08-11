/*Escreva uma função em Kotlin que receba uma lista de números inteiros e retorne uma lista contendo apenas os números que aparecem uma única vez na lista original.*/

package gpt.challenges

fun findUniqueNumbers(numbers: List<Int>): List<Int> {
    val occurrences = mutableMapOf<Int, Int>()

    // Conta as ocorrências de cada número na lista original
    for (number in numbers) {
        occurrences[number] = occurrences.getOrDefault(number, 0) + 1
    }

    // Filtra os números que aparecem uma única vez
    val uniqueNumbers = numbers.filter { occurrences[it] == 1 }

    return uniqueNumbers
}

fun main() {
    val inputList = listOf(1, 2, 2, 3, 4, 4, 5, 6, 6)
    val uniqueNumbers = findUniqueNumbers(inputList)
    println("Números únicos na lista original: $uniqueNumbers")
}
