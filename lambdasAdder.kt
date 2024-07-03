fun main() {
    val add5 = Adder(5)
    println("Result of adding 5 to 12: ${add5(12)}")
}

fun Adder(numberToAdd: Int): (Int) -> Int {
    return { input -> input + numberToAdd }
}

