fun main() {
    var l=Larger(20,10)
    println("Larger among 20 and 10 is $l")
}
fun Larger(a:Int ,b:Int):Int 
{
    if (a>b)
   		return a
    else
    	return b
}

