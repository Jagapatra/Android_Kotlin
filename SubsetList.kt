fun main() {
    var list1 = listOf<Int>(1,2,3,4,5,6,7,8,9)
    println("List 1: $list1")
    var list2 = listOf<Int>(1,199,12,34,2,3,35,43,4,5,6,7,45,9,8)
    println("List 2: $list2")
    //Using user defined function
    var newlist=SubsetList(list1,list2)
    if(newlist==true)
        println("Yes,List 1 is a subset of List 2")
    else
    	println("No,List 1 is Not a subset of List 2")
}

fun SubsetList( list1:List<Int>,list2:List<Int>):Boolean
{
    var i=0
    var count=0
    for(a in list1)
    {
        for(b in list2)
        {
            if(a==b)
            {
                count++
                break
            }
        }
        i++
    }
    if(i==count)
    	return true
    else 
    	return false
}
