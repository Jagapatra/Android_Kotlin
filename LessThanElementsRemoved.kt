fun main() {
    var numberlist = listOf<Int>(1,2,3,4)
    println(numberlist)
    
    //Using user defined function
    var newlist=LessThan(numberlist,3)
    println(newlist)
}

fun LessThan( list:List<Int>,n:Int):List<Int>
{
    var rev=mutableListOf<Int>()
    for(a in list)
    {
        if(a>=n)
        {
            rev.add(a)
        }
    }
    return rev
}
