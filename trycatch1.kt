fun divide(a: Int, b: Int){
    try
    {
        print((a / b))
    } 
    catch (e: ArithmeticException)
    {
        println("Error: Division by zero")
    }
}

fun main() {
    val numerator = 10
    val denominator = 0
    println("Result: ")
    divide(numerator, denominator)
}

