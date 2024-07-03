fun main() {
    var number = 3
    var factorial = Factorial(number)
    println("Factorial of $number is: $factorial")
    number = 9
    factorial = Factorial(number)
    println("Factorial of $number is: $factorial")
}

fun Factorial(n: Int): Long {
    val factorial: (Int) -> Long = {
        var result: Long = 1
        for (i in 1..it) {
            result *= i
        }
        result
    }
    return factorial(n)
}
