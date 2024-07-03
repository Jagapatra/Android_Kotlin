fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val squaredNumbers = numbers.map { it * it }
    val oddNumbers = squaredNumbers.filter { it % 2 != 0 }
    val sum = oddNumbers.reduce { acc, value -> acc + value }

    println("Squared numbers: $squaredNumbers")
    println("Odd numbers: $oddNumbers")
    println("Sum of odd numbers: $sum")
}

