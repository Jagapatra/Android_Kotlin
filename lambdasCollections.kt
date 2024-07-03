fun main() {
    val words = listOf("Android", "batch", "of", "Silicon", "University","in","odisha")
    val SortedWords = processStrings(words, 'o')

    println("Filtered and sorted words: $SortedWords")
}

fun processStrings(strings: List<String>, startingLetter: Char): List<String> {
    return strings
        .filter { it.startsWith(startingLetter) }
        .map { it.uppercase() }
        .sorted()
}

