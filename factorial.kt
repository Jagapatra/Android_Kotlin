fun main() {
    var l=5
    var fact=factorial(l)
    println(fact)
}
fun factorial(a:Int):Int
{
    if (a>2)
    	return a*factorial(a-1)
    else if (a==2)
    	return 2
    else
    	print("Error")
        return 1    
}
