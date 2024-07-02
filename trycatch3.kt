fun main() {
    val numbers = arrayOf(1, 2, 3, 4)

    try {
        val result1 = accessArrayElement(numbers, 2)
        println("Accessed element: $result1")

        val result2 = accessArrayElement(numbers, 9)
        println("Accessed element: $result2")
    } 
    catch (e: ArrayIndexOutOfBoundsException) 
    {
        println("Exception caught in main.")
    }
}

fun accessArrayElement(array: Array<Int>, index: Int): Int {
    try 
    {
        return array[index]
    } 
    catch (e: ArrayIndexOutOfBoundsException) 
    {
        println("Error: Index out of bounds.")
        throw e
    } 
    finally 
    {
        println("Array access operation completed.")
    }
}

