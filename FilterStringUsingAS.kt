fun main() {
    
    var user1=listOf<Any>("Jaga",7,"Arpit","Sandip",45)
    
    //Using user defined function
    var user2=filterStrings(user1)
    println(user2)
}

fun filterStrings(list: List<Any>): List<String> 
{
    var updatedlist=list.filter { it is String }.mapNotNull { it as? String }
    return updatedlist
}
