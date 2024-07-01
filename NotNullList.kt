fun main() {
    
    var len=listOf<Int?>(10,234,null,45,18,7,null)
    println("List: $len\n")
    
    println("Using user defined function")
    var listWithoutNullElements=NotNullList(len)
    println("List after removing null Elements: $listWithoutNullElements\n")
    
    println("Using pre defined library function")
    var listWithoutNull=NotNull(len)
    println("List after removing null Elements: $listWithoutNull")
}

fun NotNullList(list:List<Int?>):List<Int>
{
    var temp=mutableListOf<Int>()
    for(a in list)
    {
        if(a != null)
        temp.add(a)
    }
    return temp
}

fun NotNull(list:List<Int?>):List<Int>
    {
        var l1=list.filterNotNull()
        return l1
    }


