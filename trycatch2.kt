fun main() {
    try 
    {
        AgeLimit(15) 
    } 
    catch (e: InvalidAgeException) 
    {
        println(e.message)
    }
}

class InvalidAgeException(message: String) : Exception(message)

fun AgeLimit(age: Int) {
    if (age < 18) 
    {
        throw InvalidAgeException("You must be at least 18 years old.")
    } 
    else 
    {
        println("Age is valid.")
    }
}

