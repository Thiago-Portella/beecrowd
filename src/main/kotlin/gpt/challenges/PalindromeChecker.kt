package gpt.challenges

import java.util.*

fun main() {
    println(
        isPalindrome(readln())
    )
}

fun isPalindrome(word: String): String {
    val newWord = word.filter { it.isLetter() }.lowercase(Locale.getDefault())
    val wordReverse = newWord.reversed()
    return if (newWord == wordReverse)
    "$newWord e $wordReverse são palavras idênticas, portanto, isso é um palíndromo!"
    else
        "$newWord e $wordReverse não são palavras idênticas, portanto, isso não é um palíndromo!"
}