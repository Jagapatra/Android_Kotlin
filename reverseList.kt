package Collections

fun main() {
    var numberlist = listOf<Int>(1,2,3,4)
    println(numberlist)
    
    //With using builtin function
    var reverseList=numberlist.reversed()
    println(reverseList)
    
    //With using user defined function
    var rev=reverse(numberlist)
    println(rev)
}

fun reverse( list:List<Int>):List<Int>
{
    var i=0
    var j=0
    var rev=mutableListOf<Int>()
    for (a in list)
    {
        i++
    }
    var index=0
    for(j in 0..i-1)
    {
        rev.add(index,list[j])
        index++
    }
    return rev
}
