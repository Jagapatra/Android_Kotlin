fun main() {
    var Stringlist = listOf<String>("This","is","Android","Batch","2")
    println(Stringlist)
    
    //Using user defined function
    var newlist=ListToMap(Stringlist)
    println(newlist)
}

fun ListToMap( list:List<String>):Map<String,Int>
{
    val map = list.associate { it to it.length }
    return map
}
