fun main() {
    var l=sumOfList(20,10,13,12,90,2,4,5,4,2,2)
    println("Sum is $l")
}
fun sumOfList(vararg numbers:Int ):Int 
{
    var sum=0
    var a=0
    for(a in numbers)
    {
        sum=sum+a
    }
    return sum
}
